package API;
/**
 * 测试缓冲字符串：StringBuilder
 * 使用StringBuilder做追加操作：
 * 							StringBuilder append()		返回追加指定内容后的StringBuilder对象，
 * 					之后调用toString()方法， 在输出。
 * 适用于频繁修改字符串时使用的类
 * @author 全文超
 * 2015-08-04 09:31:26
 *
 */
public class StringBuilderDemo01 {
	public static void main(String[] args) {
		
		//使用无参构造方法创建出来的是空字符串
		StringBuilder builder = new StringBuilder();
		
		builder = new StringBuilder("Programe language:");
		/*
		 * StringBuilder不是字符串
		 * 只是用于在频繁修改字符串时使用的类，可以节省不必要的内存开销，提高性能。
		 * 想要将StringBuilder所表示的内容转化成字符串，可以调用它的toString()方法
		 * */
		
		String str = builder.toString();
//		System.out.println(str);//Programe language:
		
		
		/*
		 * StringBuilder的追加方法：
		 * 						StringBuilder append():
		 * */
		builder.append("java");//等价于：str += "java"
		builder.append(123);//append()方法可以追加整数，等价于：str += 123
		builder.append(", php");
		builder.append(", c#");
		builder.append(", object-c");
		
		str = builder.toString();
		System.out.println(str);//Programe language:java123, php, c#, object-c
	}
}
