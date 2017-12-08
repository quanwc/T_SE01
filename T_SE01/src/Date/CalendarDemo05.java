package Date;

import java.util.Calendar;

/**
 * 输出每个月的最后一天
 * @author 全文超
 * 2015-08-07 12:12:58
 *
 */
public class CalendarDemo05 {
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		/*
		 * 1. 循环输出12此， 表示12个月。但要注意：月份是从 0-11的
		 * 2. 每次循环将Calendar设置为一个月
		 * 3. 输出这个月中天数的最大值
		 */
		for(int i=Calendar.JANUARY; i<=Calendar.DECEMBER; ++i){
			calendar.set(Calendar.MONTH, i);
			int max = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			System.out.println(i+1 + "月有" + max + "天");
		}
		
	}
}
