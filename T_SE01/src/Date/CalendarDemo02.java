package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 设置时间
 * @author 全文超
 * 2015-08-07 10:09:29
 *
 */
public class CalendarDemo02 {
	public static void main(String[] args) {
		
		/*
		 * 设置时间使用Calendar提供的方法
		 * 
		 * void set(int field, int value) 对给定的时间分量设定给定的值
		 * */
		
		//对Calendar设置时间为2013-12-25
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());//创建Calendar，默认使系统时间 ，当然也可以设置，设置了就按设置后的时间。
		//Fri Aug 07 11:56:51 CST 2015
		
		/*
		 * 对于几号而言， Calendr提供了两个时间分量，意义完全一样，任选其一即可
		 * DAY_OF_MONTH、  DATE
		 */
		calendar.set(Calendar.YEAR, 2013);//设置年
		calendar.set(Calendar.MONTH, Calendar.DECEMBER);//设置月
		calendar.set(Calendar.DATE, 25);//设置日(几号)
//		calendar.set(Calendar.DAY_OF_MONTH, 25);//设置日(几号)
		
		System.out.println(calendar);//这样输出的看不懂，可以调用getTime()方法
		Date date = calendar.getTime();
		System.out.println(date);//Wed Dec 25 10:29:39 CST 2013
		
		/*如果上面输出date还不清楚明白，可以将date通过SimpleDateFormat转换为字符串类型再输出
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);//2013-12-25 10:36:12
		System.out.println(str);
		*/
		
		
		
		/*
		 * 超过改时间分量允许的最大值后，会向上进位。日向月进位，月向年进位
		 */
		calendar.set(Calendar.DATE, 33);
		System.out.println(calendar.getTime());
		//Thu Jan 02 10:43:51 CST 2014
	}
}
