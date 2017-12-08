package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算促销时间：
 * 			输出一件商品在到期前两周的周三作为促销日期
 * @author 全文超
 * 2015-08-08 11:28:18
 *
 */
public class SaleDemo01 {
	public static void main(String[] args) throws ParseException {
		
		/*
		 * 1. 创建Scanner用于获取用户输入的内容
		 * 		i> 输入生产日期
		 * 		ii>输入保质期
		 * 2. 将String类型转为Date类型，在转为Calendar进行计算
		 * 3. 将Calendar在转为Date，在转为String输出
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入生产日期: yyyy-MM-dd:");
		String proStr = scan.nextLine();//生产日期
		System.out.println("请输入保质期,单位天:");
		String quaStr = scan.nextLine();//保质期
		int num = Integer.parseInt(quaStr); //将保质期字符串转为int类型
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date proDate = sdf.parse(proStr);
		
		Calendar calendar = Calendar.getInstance();//创建Calendar实例
		calendar.setTime(proDate);
		calendar.add(Calendar.DAY_OF_YEAR, num);
		calendar.add(Calendar.DAY_OF_YEAR, -14);//此时calendar保存最后期限
//		int week = calendar.get(Calendar.DAY_OF_WEEK);
//		if(week>4){//周三其实是这周的第四天
//			calendar.add(Calendar.DAY_OF_YEAR, -3);
//		}else if(week<4){
//			calendar.add(Calendar.DAY_OF_YEAR, 3);
//		}
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);//设置周三
		Date finDate = calendar.getTime();
		String str = sdf.format(finDate);
		System.out.println(str);
	}
}


/*
 * 程序运行过正确：
 * 请输入生产日期: yyyy-MM-dd:
2014-8-8
请输入保质期,单位天:
365
2015-07-22
 * */
