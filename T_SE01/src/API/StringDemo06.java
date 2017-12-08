package API;
/**
 * 测试去除字符串两边的空白:	
 * 						String trim()	返回去除两侧空白后的字符串
 * @author 全文超
 * 2015-08-02 16:40:04
 *
 */
public class StringDemo06 {
	public static void main(String [] args){
		
		/*
		 * 空白包括： 空格， tab等
		 * */
		String userName = "  good man		a";
		
		/*
		 * String trim()方法
		 * 去除字符串两侧的空白，不管中间的空白
		 * */
		String trim = userName.trim();
		
		
		System.out.println(userName);//  good man		a
		System.out.println(trim);	 //good man		a
	}
}
