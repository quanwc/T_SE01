package Object;
/**
 * jdk 1.5 之后推出新特性： 自动拆装箱
 * 基本类型不能参与面向对象的开发，所以要将其变为包装类就ok了。
 * @author 全文超
 * 2015-08-06 08:50:32
 *
 */
public class NumberDemo04 {
	public static void main(String[] args) {
		
		/*int a = 1;
		say(a);
		*/
		
		int a = 1;
//		Integer ii = new Integer(a);
		Integer ii = Integer.valueOf(a);//转换为包装类推荐使用静态方法valueof()
		say(a);

//		int b = ii;//基本类型可以接受引用类型的数值，自动拆箱		
		//获取Integer对象ii中的保存的整数
		a = ii.intValue();//把包装类对应的数字转为基本类型int值， 反响转换，还可以转回来。
		System.out.println("a=" + a);
	}
	
	public static void say(Object obj){
		System.out.println(obj);
	}
}
