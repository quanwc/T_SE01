package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 删除集合元素：
 * 			boolean remove(Object o)	只删除一个，并且是删除第一个满足要求的
 * 		删除集合中第一个与  给定的元素  相同的元素(相同是依靠元素的equals方法比较的)
 * @author 全文超
 * 2015-08-08 17:17:23
 *
 */
public class CollectionDemo06 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Cell(1,2));
		c.add(new Cell(1,3));
		c.add(new Cell(1,4));
		c.add(new Cell(1,5));
		System.out.println(c.size());//4
		System.out.println(c);//[(1,2), (1,3), (1,4), (1,5)]
		
		
		Cell cell = new Cell(1,3);
		
	//	c.remove(cell);
		System.out.println(c);
		System.out.println("===========");
		
		c.remove(new Cell(1,5));//只能删除一个
		//Cell中的equals有没有被重写，结果不一样。
		//如果删掉Cell的equals：删除失败
		//如果保留Cell的equals：删除成功，equals比较的是内容，内容相同就可以删除成功。
		System.out.println(c.size());//3
		System.out.println(c);//[(1,2), (1,4), (1,5)]
	}
}
