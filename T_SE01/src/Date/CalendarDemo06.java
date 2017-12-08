package Date;

import java.util.Calendar;

/**
 * 计算某个时间分量所对应的值
 * 						void add()
 * @author 全文超
 * 2015-08-07 12:34:53
 *
 */
public class CalendarDemo06 {
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());//Fri Aug 07 13:27:57 CST 2015
		
		//对当前日期加上1个月
		calendar.add(Calendar.MONTH, 1);
		System.out.println(calendar.getTime());//Mon Sep 07 13:28:11 CST 2015
		
		//加上2年
		calendar.add(Calendar.YEAR, 2);
		System.out.println(calendar.getTime());//Thu Sep 07 13:29:06 CST 2017
		
		//加上11天
		calendar.add(Calendar.DAY_OF_YEAR, 11);
		System.out.println(calendar.getTime());//Mon Sep 18 13:30:12 CST 2017
		
		//减去12小时
		calendar.add(Calendar.HOUR_OF_DAY, -12);//减去12，就是加上-12
		System.out.println(calendar.getTime());//Mon Sep 18 01:31:51 CST 2017
		
		
	}
}
