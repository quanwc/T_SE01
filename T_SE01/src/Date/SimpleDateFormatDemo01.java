package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 通过SimpleDateFormat：将Date转换为String
 * @author	全文超
 * 2015-08-06 22:34:06
 */
public class SimpleDateFormatDemo01 {
	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);//Thu Aug 06 12:31:18 CST 2015
		
		/*	
		 * 日期格式字符串：
		 * 2015年08月06日 12:29:56
		 * 	yyyy年MM月dd日 HH:mm:ss
		 * 
		 * 
		 *	2015年08月06日 12:29:56
		 *	yyyy-MM-dd HH:mm:ss 
		 */
		
		//SimpleDateFormat：是在日期格式字符串与日期之间相互转换的类，是桥梁
		
		//创建SimpleDateFormat对象的时候，要求传入一个参数。传的就是日期格式字符串，
		//SimpleDateFormat是相互转换的类，有了参数，它就知道该以哪种格式来转换了
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd日 HH:mm:ss");
		
		//我们想要将Date对象转成一个特定的字符串，调用哪个format方法，同时传入一个Date对象，这个Date对象就是希望转换的Date对象。
		//(Date对象封装了时间—)，同时返回一个字符串，这个字符串就是将Date对象按照特定格式转换后的字符串
		String str = sdf.format(now);
		System.out.println(str);//2015年08月06日 12:31:05
	}
}
