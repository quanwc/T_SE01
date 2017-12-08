package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 使用迭代器遍历集合元素
 * @author 全文超
 * 2015-08-08 17:52:56
 *
 */
public class IteratorDemo01 {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add("java");
		c.add("cpp");
		c.add("php");
		c.add("c#");
		c.add("objective-c");
		
		//获取迭代器
		Iterator it = c.iterator();
		while(it.hasNext()){//询问
			String str = (String)it.next();//获取
			System.out.print(str + " ");
		}
		//java cpp php c# objective-c 
		
	}
}
