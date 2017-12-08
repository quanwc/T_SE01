package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 测试集合的size, clear, isEmpty方法
 * @author 全文超
 * 2015-08-08 16:35:32
 *
 */
public class CollectionDemo04 {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
//		boolean isEmpty = c.isEmpty();
//		System.out.println(isEmpty);//true
//		System.out.println(c.size());//0
		
		c.add("java");
		c.add("cpp");
		c.add("php");
		c.add("c#");
		c.add("objective-c");
		
		c.remove("php");
		System.out.println(c);
		System.out.println(c.isEmpty());//false
		System.out.println(c.size());//5
		
		
		System.out.println("===========");
		c.clear();//清空集合
		System.out.println(c);
		System.out.println(c.isEmpty());//true
		System.out.println(c.size());//0
	}
}
