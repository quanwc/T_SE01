package API;
/***
 * 测试截取字符串:	
 * 				String substring()		返回截取后的字符串
 * @author 全文超
 * 
 * 2015-08-02 15:43:27
 *
 */
public class StringDemo05 {
	public static void main(String [] args){
		
		//获取字符串oracle
		/***
		 * javaAPI中有个小特点：
		 * 凡是使用2个数字表示范围的，通常都是"含头不含尾"的
		 */
		String str = "http://www.oracle.com";
		String sub = str.substring(11, 17);
		System.out.println(sub);//oracle
		
		
		//substring()方法一个参数的话，从指定位置开始截取到字符串末尾
		sub = str.substring(7);
		System.out.println(sub);//www.oracle.com
		
		
		//获取文件名，即就是去掉文件的后缀
		/**
		 * mypic.jpg
		 * 获取文件名
		 * 1. 先找到"."的位置
		 * 2. 从第一个字符开始截取到"."的位置
		 */
		String name = "mypic.jpg";
		int index = name.indexOf(".");
		String subName = name.substring(0, index);
		System.out.println(subName);//mypic
	}
}
