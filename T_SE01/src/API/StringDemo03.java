package API;
/**
 * String常量池的测试
 * @author 全文超
 * 2015-08-02 15:21:34
 */
public class StringDemo03 {
	public static void main(String[] args) {
		String str = "haha";
		String str2 = "haha";
		System.out.println(str == str2);//true
		
		/** 通过上面的代码， 可知str和str2指向同一个对象*/
		str2+="heihei";//修改str2引用的内容
		System.out.println(str);//haha，str引用所指向对象的内容没变
		System.out.println(str2);//hahaheihei，str2所指向对象的内容改变了

		System.out.println(str == str2);
		//false，str和str2的内存地址不在一样，他俩不再指向同一个对象
	}
}
