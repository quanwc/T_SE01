package List;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List：是一个接口，不能实例化
 * 常用实现类：ArrayList、LinkedList
 * 
 * List集合	是可重复集，且有序，特点是可以根据下标操作元素，这一点和数组很相似
 * 
 * List集合的get(),set()方法
 * @author 全文超
 * 2015-08-09 12:17:46
 *
 */
public class ListDemo01 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		boolean bo = list.add("java");
//		System.out.println(bo);
		list.add("cpp");
		list.add("php");
		list.add("c#");
		list.add("objective-c");
		
		/**
		 * get()方法用于获取指定位置的元素
		 * E get(int index)
		 */
		for(int i=0; i<list.size(); i++){
			String str = list.get(i);
			System.out.print(str + " ");
		}
		System.out.println();
		
		
		/**
		 * 将cpp替换为c++
		 * E set(int index, E e)
		 * 将给定的元素设置到指定位置上，返回值为原位置上的元素
		 */
		String old = list.set(1, "c++");
		System.out.println(list);//输出集合:[java, c++, php, c#, objective-c]
		System.out.println("old=" + old); //old=cpp
		
		
		/**
		 * 将下标为1和下标为3的这两个位置上的元素互换
		 * 1. 将1这个位置上的元素取出来并保存
		 * 2. 将3这个位置上的元素设置为1的元素
		 * 3. 将3被替换的元素存入1这个位置
		 * 
		 * 结果：
		 * 		[java, c#, php, c++, objective-c]
		 */
		String e = list.get(1);
		String e2 = list.set(3, e);
		list.set(1, e2);
		System.out.println(list);//[java, c#, php, c++, objective-c]
		/*上面的4行代码可以替换为下面2行
		list.set(1, list.set(3, list.get(1)));
		System.out.println(list);//[java, c#, php, c++, objective-c]
  		*/

	}
}
