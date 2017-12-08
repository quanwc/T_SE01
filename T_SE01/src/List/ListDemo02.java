package List;

import java.util.LinkedList;
import java.util.List;

/**
 * List的插入与删除
 * @author 全文超
 * 2015-08-09 12:59:51
 *
 */
public class ListDemo02 {
	public static void main(String[] args) {
	
		List<String> list = new LinkedList<String>();
		list.add("java");
		list.add("c#");
		System.out.println(list);//[java, c#]
		
		
		/**
		 * 在java和c#之间插入cpp
		 * 			void add(int index, String element)
		 * 结果：[java, cpp, c#]
		 */
		list.add(1, "cpp");
		System.out.println(list);//[java, cpp, c#]
		
		
		/**
		 * 删除第三个元素
		 * 		E remove(int index)
		 * 		删除指定位置的元素并返回
		 */
		String old = list.remove(2);
		System.out.println(list);//[java, cpp]
		System.out.println("被删除的是:" + old);//被删除的是:c#
	}
}
