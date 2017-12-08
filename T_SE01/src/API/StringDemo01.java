package API;
/**
 * 测试常量池
 * @author 全文超
 *2015-08-02 10:25:34
 */
public class StringDemo01 {
	
	/**
	 * 测试常量池
	 * @param args
	 */
	public static void main(String[] args){
		/**
		 * String类在java.lang包中。
		 * 该包中的类使用频率非常高，不需要import， 可直接使用。
		 */
		String str1 = "hello";
		
		/**
		 * 没有创建新对象， 引用的是str1指向的对象
		 */
		String str2 = "hello";
		
		//强制创建新对象
		String str3 = new String("hello");
		
		System.out.println(str1 == str2);//true
		System.out.println(str1.equals(str2));//true
		System.out.println(str1 == str3);//false
	}
}
