package API;
/**
 * 测试charAt()方法的作用：
 * 					char charAt()	返回字符串指定位置的字符
 * @author 全文超
 * 2015-08-02 16:55:14
 *
 */
public class StringDemo07 {
	public static void main(String [] args){
		
		String str = "Whatisjava?";
		/**
		 * char charAt(int index)
		 * 获取当前字符串中指定位置的字符
		 * 0表示第一个字符
		 */
		
		//获取i
		char ch = str.charAt(4);
		System.out.println(ch);//i

		
		//顺序输出字符串中所有字符
		for(int i=0; i<str.length(); ++i){
			ch = str.charAt(i);
			System.out.print(ch + " ");//W h a t i s j a v a ? 
		}
	}
}
