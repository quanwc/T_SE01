package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 测试集合：
 * 		List: 可重复集，是有序集(存进去和取出来的顺序一致)
 * 		Set:  不可重复集，大部分实现类是无序的
 * @author 全文超
 * 2015-08-08 09:40:00
 *
 */
public class CollectionDemo01 {
	public static void main(String[] args) {
		
		//创建一个集合
		Collection c = new ArrayList();
		c.add("11");
		c.add("22");
		System.out.println(c);
		
		
		/*
		 * 		集合默认情况下任何类型的实例都可以存入，就好像Object类型数组一样。
		 * 但是，通常我们只在集合中存入一种类型的实例，那么取出来就都是一种类型的对象。
		 */
		
		c.add(new Cell(1, 2));//向集合中添加元素，调用add()方法
		
		Cell cell = new Cell(3, 4);
		c.add(cell);
		
		System.out.println(cell);//(3,4)
		System.out.println(c);//[(1,2), (3,4)]
		
		
		//修改cell的行
		cell.setRow(4);
		System.out.println(cell);//(4,4)
		System.out.println(c);//[(1,2), (4,4)]
		/* 外界将集合内容改变，集合看到的就是改变后结果。(cell与集合c引用的是同一块对象)所以集合中存的是引用*/
	}
}
