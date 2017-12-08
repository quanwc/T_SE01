package API;
/**
 * 使用StringBuilder做插入操作:
 * 							StringBuilder insert()	返回插入指定内容后的StringBuilder对象，
 * 				之后在调用toString()方法，将其变为字符串，在输出
 * @author 全文超
 * 2015-08-04 10:16:31
 *
 */
public class StringBuilderDemo02 {
	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("javacppc#object-c");
		
		/*
		 * 希望变成字符串：	javacppc#phpobjcet-c
		 * 
		 * StringBuilder insert(int index, String str)
		 * 向指定位置插入指定字符串，原位置字符串顺序向后移动
		 */
		builder.insert(9, "php");
		String str1 = builder.toString();
		System.out.println(str1);//javacppc#phpobject-c

	}
}
