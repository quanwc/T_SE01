package API;
/**
 * 测试删除字符串的部分内容：
 * 						StringBuilder delete()		返回删除指定位置内容后的StringBuilder对象
 * @author 全文超
 * 2015-08-04 10:41:06
 *
 */
public class StringBuilderDemo03 {
	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("javaoraclec#php");
		String s = builder.toString();
		System.out.println(s);//javaoraclec#php
		/*
		 * 删除oracle
		 *			结果：javac#phpobjective-c 
		 * StringBuilder delete(int from, int end):  删除字符串中指定范围内的字符
		 */
		builder.delete(4, 10);
		builder.append("object-c");
		String str = builder.toString();//将StringBuilder字符序列对象变为字符串String类型
		System.out.println(str);//javac#phpobject-c

	}
}
