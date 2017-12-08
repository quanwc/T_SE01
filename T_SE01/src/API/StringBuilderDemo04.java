package API;
/**
 * 替换字符串内容：
 * 				StringBuilder replace()		返回替换后的对象
 * @author 全文超
 * 2015-08-04 11:08:24
 *
 */
public class StringBuilderDemo04 {
	public static void main(String [] args){
		
		StringBuilder builder = new StringBuilder("javaoraclephp");
		String s = builder.toString();
		System.out.println(s);//javaoraclephp
		
		/*
		 * StringBuilder允许将部分内容替换
		 * StringBuilder replace(int from, int end, String str)
		 * 将范围内的字符串替换为给定的字符串
		 * 
		 * 结果：javac#php
		 */
		builder.replace(4, 10, "c#");
		String str = builder.toString();
		System.out.println(str);//javac#php
	}
}
