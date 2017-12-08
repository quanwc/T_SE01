package API;
/**
 * 测试字符串长度:		
 * 				int length()		返回字符串的长度
 * @author 全文超
 * 2015-08-02 11:43:22
 */
public class StringDemo02 {
	public static void main(String [] args){
		
		String str1 = "  hi ";
		System.out.println(str1.length());//5。字符串长度也包括空格
		
		
		String str = "helloworld";
		/**
		 * 简化代码的方式：
		 * 从下至上， 等量代换
		 */
		//简化之前的效果
		int len = str.length();//获取的是字符串的字符量(包括:中文，英文，符号，空格)
		System.out.println("长度:" + len);
		
		//简化之后的效果：
		System.out.println("长度:" + "helloworld".length());
		
		
		
		String str2 = "你好,String";
		System.out.println(str2.length());//9
	}
}
