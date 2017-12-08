package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 测试Calendar的setTime()
 * @author 全文超
 * 2015-08-07 15:44:50
 *
 */
public class CalendarDemo08 {
	public static void main(String[] args) throws ParseException {
		
		/**
		 * void setTime(Date date)
		 * 使当前Calendar对象描述给定的Date对象所表示的日期。
		 */
		/*
		 * 输入女朋友的生日，输出明年女朋友的生日字符串	格式：2014--11-20 星期四。
		 * 1. 创建Scanner用于获取用户输入的日期。
		 * 2. 将日期通过SimpleDateFormat转换为Date。
		 * 3. 将Date转换为Calendar，用于计算。
		 * 4. 将calendar加上一年。
		 * 5. 再通过Calendar获取对应的Date。
		 * 6. 通过SimpleDateFormat输出成目标格式。
		 */
		
		//1
		Scanner scan = new Scanner(System.in);
		System.out.println("please input birthday of your girlfriend:yyyy-MM-dd");
		String birStr = scan.nextLine();//获取生日字符串
		
		//2 通过SimpleDateFormat将String转换为Date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birDate = sdf.parse(birStr);//将生日转换为对应得Date类型
		
		//3.通过Calendar的setTime()将Date转换为Calendar
		Calendar calendar = Calendar.getInstance();//创建Calendar实例
		calendar.setTime(birDate);//让calendar描述输入的生日那天
		
		//4
		calendar.add(Calendar.YEAR, 1);
		
		//5.通过Calendar的getTime()方法将Calendar转换为Date
		birDate = calendar.getTime();//一年以后生日那天
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		
		//6.通过SimpleDateFormat将Date转换为String
		//SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd E");
		String str = sdf.format(birDate);
		System.out.println("birth:" + str);
		System.out.println(str + "," +"星期"+( (week-1)==0?"日":(week-1)));
	}
}
