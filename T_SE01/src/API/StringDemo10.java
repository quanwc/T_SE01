package API;
/**
 * 将其他类型(8中基本类型的数据)转换为字符串：	
 * 					static String valueOf()，String有若干的重载方法
 * @author 全文超
 * 2015-08-02 17:47:21
 *
 */
public class StringDemo10 { 
	public static void main(String[] args) {
		
		/*
		 * String有若干的重载方法valueOf()
		 * */
		
		double pi = 3.1415926;
		boolean flag = true;
		int value = 123;
		char[] charArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		
		
		//基本类型转字符串：
		//				方法1：只需要在基本类型后加空字符串("")即可
		//				原因： 基本类型数据与空字符串拼接可以将基本类型数据转换为字符串
		String str = pi + "";
		String str1 = flag + "";
		
		System.out.println(str);//3.1415926
		System.out.println(str1);//true
		
		
		//基本类型转字符串：
		//				方法2：使用valueOf()方法， valueOf()方法是静态的，可以使用类名来调用
		//将double类型的pi转换为字符串类型
//		String str5 = (String)pi;	//使用强转是不行的。
		str = String.valueOf(pi);
		System.out.println(str);//3.1415926
		
		str = String.valueOf(flag);
		System.out.println(str);//true
		
		str = String.valueOf(value);
		System.out.println(str);//123
		
		str = String.valueOf(charArr);
		System.out.println(str);//abcdefg
		
		
	}
}
