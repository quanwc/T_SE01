package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * contains()方法：
 * 				用于查看集合中是否包含给定的元素
 * 				boolean contains(Object o)	包含返回true
 * @author 全文超
 * 2015-08-08 16:02:22
 *
 */
public class CollectionDemo03 {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add(new Cell(1,2));
		c.add(new Cell(1,3));
		c.add(new Cell(1,4));
		boolean b = c.add(new Cell(1,5));
		System.out.println(c);
		
		Cell cell = new Cell(1,3);
		
		//检查集合中是否包含cell
		boolean contains = c.contains(cell);
		System.out.println("是否包含cell:" + contains);
		/*
		 * 如果将Cell类中的equals()方法删掉：false
		 * 如果不删除Cell类中的equals()方法： true
		 * 
		 * 原因：
		 * 		元素值是否重复，取决于元素的equals()方法比较的结果。
		 * 		Cell对象元素是按照数值比较是否相等的，所以就是已经包含了。
		 *      而删掉Cell的equals()方法，就按照Object的equals()比较，按照地址比较。显然地址不一样。
		 * */


	}
}
