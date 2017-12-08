package Object;
/**
 * Number是6个数字包装类型的父类
 * @author 全文超
 * 2015-08-05 17:00:07
 *
 */
public class NumberDemo01 {
	public static void main(String[] args) {
		
		Number d = new Double(123.45);
		Number n = new Integer(789);
		
		System.out.println(n);//789
		
		//将123.45变为整数int类型
		int i= d.intValue();
		System.out.println(i);//123
		double dou = d.floatValue();
		System.out.println(dou);//123.44999694824219
		
		
		i = n.intValue();
		System.out.println(i);//789
		dou = n.doubleValue();
		System.out.println(dou);
		
	}
}
