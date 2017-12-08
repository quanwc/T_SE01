package Date;

import java.util.Date;

/**
 * java.util.Date
 * 				该类的每一个实例用于描述一个时间
 * @author 全文超
 * 2015-08-06 11:47:12
 *
 */
public class DateDemo01 {
	public static void main(String[] args) {
		
		//描述系统当前时间
		Date date = new Date();
		System.out.println(date);//Thu Aug 06 11:47:49 CST 2015
		
		
		//获取1970年元旦到系统时间之间的毫秒值
		long time = date.getTime();
		System.out.println(time);//1438832989721
		System.out.println(date.toString());
	}
}
