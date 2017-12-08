package Date;

import java.util.Calendar;

/**
 * 输出一年后再减去3个月的日期
 * @author 全文超
 * 2015-08-07 15:40:31
 *
 */
public class CalendarDemo07 {
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());//Fri Aug 07 15:41:23 CST 2015
		
		calendar.add(Calendar.YEAR, 1);
		calendar.add(Calendar.MONTH, -3);
		System.out.println(calendar.getTime());//Sat May 07 15:42:37 CST 2016
	}
}
