package Date;

import java.util.Calendar;

/**
 * 获取某个时间分量所允许的最大值
 * @author 全文超
 * 2015-08-07 11:34:04
 *
 */
public class CalendarDemo04 {
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		//这个月有多少天
		System.out.println(calendar.getTime());
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("这月有" + days + "天");//这月有31天
		
		
		
		//今年有多少天
		days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("今年有:" + days);//今年有:365
		
		
		/*
		 * 当前月中的第几个星期:DAY_OF_WEEK_IN_MONTH		范围1-4，一个月中最少有1周，最多4周
		 */
		System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));//4
		System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);//???
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));//???
	}
}
