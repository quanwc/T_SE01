package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 	add()方法：
 * 			  用于向集合中添加元素:
 * 		     boolean add(E e)	添加成功返回true
 * @author 全文超
 * 2015-08-08 15:40:39
 *
 */
public class CollectionDemo02 {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		System.out.println(c);
	}
}
