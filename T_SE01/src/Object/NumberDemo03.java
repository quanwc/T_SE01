package Object;
/**
 * 包装类支持将字符串转换为对应的基本类型
 * @author 全文超
 * 2015-08-05 19:12:37
 *
 */
public class NumberDemo03 {
	public static void main(String[] args) {
		
		String str = "123";
		
		/*
		 * 包装类都支持：parseXXX方法
		 * 使用地方：
		 * 			在网页上注册，写了一个数字，向服务器端发送的是一个字符串，java想要对它进行操作，
		 * 		就要Integer.parseInt()转过来才行，先将它转换为整数，然后再进行操作。
		 */
		int num = Integer.parseInt(str);
//		System.out.println(Integer.parseInt("12.56"));//运行错误。如果想要将str变为整数，那么str这个字符串里就必须是整数，不能是小数
		System.out.println(num + 1);//124
		//说明将"123"已经转换为了整数123，加1之后变为124
		
		String str1 = "true";
		boolean bo =Boolean.parseBoolean(str1);
		System.out.println(bo);
		if(bo){
			System.out.println("hah");
		}
		
		double dou = Double.parseDouble(str);
		System.out.println(dou + 1);//124.0
	}
}
