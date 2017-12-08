package Date;

import java.util.Date;

/**
 * 测试Date的getTime()和setTime()方法
 * @author 全文超
 * 2015-08-06 11:53:00
 *
 */
public class DateDemo02 {
	public static void main(String[] args) {
		
		Date now = new Date();//创建当前系统时间
		System.out.println(now);//Date重写了toString()方法
		
		
		/*
		 * 计算明天此刻的时间
		 * 1. 获取今天这一刻的毫秒值
		 * 2. 对其加上1天的毫秒值
		 * 3. 将计算后的毫秒值设置到Date中让其表示
		 */
		long time = now.getTime();		//getTime()方法有返回值
		time += 24 * 60 * 60 * 1000;
		//让当前Date表示给定的毫秒值所指定的时间
		now.setTime(time);				//setTime()没有返回值
		System.out.println(now);//Fri Aug 07 12:02:14 CST 2015
	}
}
