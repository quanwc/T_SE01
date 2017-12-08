package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 使用Collections接口中的sort()方法
 * 						对Cell进行自然排序
 * @author 全文超
 * 2015-08-10 16:01:16
 *
 */
public class ListDemo07 {
	public static void main(String[] args) {
		
		List<Cell> list = new ArrayList<Cell>();
		list.add(new Cell(2,3));
		list.add(new Cell(5,3));
		list.add(new Cell(1,6));
		list.add(new Cell(7,9));
		
		
		/*
		 * 若集合中的元素没有实现Comparable接口，那么调用sort方法编译不能通过
		 */
		System.out.println(list);//[(2,3), (5,3), (1,6), (7,9)]
		Collections.sort(list);
		System.out.println(list);//[(1,6), (2,3), (5,3), (7,9)]
	}
}
