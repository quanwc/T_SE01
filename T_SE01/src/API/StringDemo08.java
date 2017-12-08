package API;
/**
 * 判断字符串以什么开头或结尾:
 * 						boolean startWith()		判断当前字符串是否以给定的字符串起始
 * 						boolean endWith()		判断当前字符串是否以给定的字符串结尾
 * @author 全文超
 * 2015-08-02 17:09:15
 *
 */
public class StringDemo08 {
	public static void main(String [] args){
		
		//这是一本不推荐新手看的好书
		String str = "Thinking in java";
		
		/*
		 * boolean startWith(String str)
		 * 		判断当前字符串是否以给定的字符串起始
		 * boolean endWith(String str)
		 * 		判断当前字符串是否以给定的字符串结尾
		 * */
		
		boolean ends = str.endsWith("java");
		System.out.println(ends);//true
		System.out.println(str.endsWith("Java"));//false，严格区分大小写
		
		System.out.println(str.startsWith("Think"));//true
		System.out.println(str.startsWith("T"));//true
		
		//aaa.doc
		/*
		 * 判断文件类型(图片，文档)时，可以使用endWith()判断文件的类型
		 * */
	}
}
