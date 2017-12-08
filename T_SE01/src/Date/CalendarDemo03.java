package Date;

import java.util.Calendar;

/**
 * 获取某个时间分量的值
 * 				int	get(field)
 * @author 全文超
 * 2015-08-07 11:05:52
 *
 */
public class CalendarDemo03 {
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		/*
		 * 设置时间为2014-04-23
		 */
//		calendar.set(Calendar.YEAR, 2014);
//		calendar.set(Calendar.MONTH, Calendar.APRIL);
//		calendar.set(Calendar.DATE, 23);
		
		/*
		 * 获取今天是周几,也就是这周的第几天
		 * int get(int field)
		 * 获取给定的时间分量所定义的值
		 */
		int d = calendar.get(Calendar.DAY_OF_WEEK);
//		System.out.println(d);//美国人习惯:周日为一周的第一天
		System.out.println("现在是周" + (d==1 ? "日" : d-1));//现在是周3
		
		
		
		/*
		 * 获取现在的时间：
		 * HOUR:12小时制
		 * HOUR_OF_DAY:24小时制
		 * */
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		
		System.out.println("现在是:" + h + ":" + m + ":" +s);//现在是:11:24:32
		
		
		
		/*
		 * 查看今天是今年的多少天，即今年已经过了多少天了。
		 */
		int days = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("已经过了:" + days + "天了");//已经过了:113天了
		
		
		int da = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println(da);//???
		
				
	}
}
