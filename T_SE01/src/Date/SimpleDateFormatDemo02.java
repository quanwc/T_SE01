package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat将字符串转换为Date
 * @author 全文超
 * 2015-08-06 18:58:19
 *
 */
public class SimpleDateFormatDemo02 {
	public static void main(String[] args) throws ParseException {
		
		String str = "2001/8月06 19:05:57";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM月dd HH:mm:ss");//要转的格式
		Date date = sdf.parse(str);//将需要转换为Date类型的字符串传入
		System.out.println(date);//Thu Aug 06 19:05:57 CST 2015
		
	}
}
