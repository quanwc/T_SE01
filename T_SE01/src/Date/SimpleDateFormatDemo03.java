package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 用户输入一个时间， 设计程序，返回用户活的天数
 * @author 全文超
 * 2015-08-06 19:16:04
 *
 */
public class SimpleDateFormatDemo03 {
	public static void main(String[] args) throws ParseException  {
		
		/*
		 * 1. 获取用户输入的生日
		 * 2. 将其转换为Date
		 * 3. 创建一个Date用于表示当前系统时间
		 * 4. 用当前系统时间的毫秒值减去生日的毫秒值
		 * 4. 将差除以一天的毫秒值
		 * 5. 商就是经过的天数
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please input you birthday:yyyy-MM-dd");
		String bir = scan.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birDate = sdf.parse(bir);//出生时的日期
	    
	    Date nowDate = new Date();
	    long time = nowDate.getTime() - birDate.getTime(); 
	    long days = time/(24*60*60*1000);
	    System.out.println("恭喜您，已经活了:" + days + "天");
	}
}


/*
 * 程序运行结果正确：
 * please input you birthday:yyyy-MM-dd
1993-02-03
恭喜您，已经活了:8220天
 * */
