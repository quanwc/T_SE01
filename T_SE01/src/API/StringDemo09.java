package API;
/**
 * 测试英文的大小写转换：
 * 					String toUpperCase()	将当前字符串的英文部分转换为大写,不考虑中文
 * 					String toLowerCase()	将当前字符串的英文部分转换为小写,不考虑中文
 * @author 全文超
 * 2015-08-02 17:36:48
 *
 */
public class StringDemo09 {
	public static void main(String [] args){
		
		String str = "我喜欢Java";
		
		String upper = str.toUpperCase();
		String lower = str.toLowerCase();
		
		System.out.println(upper);//我喜欢JAVA
		System.out.println(lower);//我喜欢java
		
		//使用地方：
		//		  验证码大小写检查的时候会用到
	}
}
