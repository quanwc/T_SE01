package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算促销时间
 * 			输出一件商品在到期前2周的周三作为促销日期
 * @author 全文超
 * 2015-08-08 13:51:05
 *
 */
public class SaleDemo02 {
	public static void main(String[] args) throws ParseException {
		
		/*
		 * 1. 创建Scanner用于获取用户输入的内容
		 * 		1.1：输入生产日期
		 * 		1.2： 输入保质期
		 * 2. 通过SimpleDateFormat将生产日期的字符串转换为Date
		 * 3. 将生产日期转换为Calendar
		 * 4. 计算保质期的临期日
		 * 5. 计算前两周
		 * 6. 设置为当周的周三(此时已经计算好了促销日)
		 * 7. 将促销日转换为Date
		 * 8. 通过SimpleDateFormat将Date转换为字符串
		 * 9.输出促销日
		 */
		Date dates = new Date();
		System.out.println(dates.getTime());
		
		//1
		Scanner scan = new Scanner(System.in);
		
		//1.1
		System.out.println("请输入生产日期:yyyy-MM-dd");
		String dateStr = scan.nextLine();
		
		//1.2
		System.out.println("请输入保质期(天数):");
		int days = scan.nextInt();//接收一个整数
		
		//2.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dateStr);
		
		//3.
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);//此时已经将Date对象变为了Calendar类型
		
		//4.
		calendar.add(Calendar.DAY_OF_YEAR, days);
		
		//5.
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		
		//6.
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		//或者：calendar.set(Calendar.DAY_OF_WEEK, 4);
		
		//7.
		date = calendar.getTime();//将Calendar类型变为Date类型
		
		//8.
		dateStr = sdf.format(date);

		//9.
		System.out.println("促销日:" + dateStr);
	}
}

/*
 * 程序运行结果正确：
 * 请输入生产日期:yyyy-MM-dd
2015-08-08
请输入保质期(天数):
28
促销日:2015-08-19
 * */