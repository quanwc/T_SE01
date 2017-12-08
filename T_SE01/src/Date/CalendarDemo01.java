package Date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Calendar:用于操作时间的类
 * 			操作: 设置，获取，计算时间
 * @author 全文超
 * 2015-08-07 08:58:22
 *
 */
public class CalendarDemo01 {
	public static void main(String[] args) {
		
		//创建Calendar实例，Calendar创建出来的时候，内部表示的是系统时间。
		//即默认创建的Calendar表示的是系统时间
		Calendar calendar = Calendar.getInstance();
	//  父类					 子类

		
		
		
		/*
		 * 查看对象的类型
		 * obj.getClass().getName()返回这个对象的所属名字(即就是这个实例对象所属的时区名)。
		 * */
		String className = calendar.getClass().getName();
		System.out.println(className);//java.util.GregorianCalendar
		
		
		//输出的是GregorianCalendar的toString()返回值，看不懂。要想得到时间，可以调用getTime()方法
		System.out.println(calendar);
		/*
		 * Calendar定义了一个方法：
		 * 				Date getTime()	返回一个Date对象，该对象描述了该Calendar对象所表示的时间
		 * */
		Date date = calendar.getTime();
		System.out.println(date);//Fri Aug 07 09:22:19 CST 2015
		
		
		
		/*
		 * 直接new：
		 * 月份是从0开始的：0---11月
		 * 月份在Calendar中也有对应的常量：Calendar.DECEMBER 
		 * */
		//表示2015-8-7
		Calendar gCalendar = new GregorianCalendar(2015, 7, 7);
		
		
	}
}
