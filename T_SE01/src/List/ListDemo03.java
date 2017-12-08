package List;

import java.util.ArrayList;
import java.util.List;

/**
 * 取子集：
 * 		subList()
 * @author 全文超
 * 2015-08-09 13:12:13
 *
 */
public class ListDemo03 {
	public static void main(String[] args) {
		
		/**
		 * List subList(int start, int end)
		 * 获取当前集合中的子集
		 */
		List<Integer> list = new ArrayList<Integer>();
		//泛型的<>中只能是引用类型。想要存整数，不能写list<int>, 可以通过包装类实现<Integer>
		
		//向集合中添加10个元素:0-9
		for(int i=0; i<10; i++){
			list.add(i);
		}
		System.out.println(list);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		
		//获取子集
		List<Integer> subList = list.subList(3, 8);
		System.out.println(subList);//[3, 4, 5, 6, 7]
		System.out.println(list);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		
		//将子集中每个元素扩大10倍
		for(int i=0; i<subList.size(); ++i){
			int num = subList.get(i);
			num *= 10;
			subList.set(i, num);
		}
		//对子集元素的任何操作都会影响原集合
		System.out.println(subList);//[30, 40, 50, 60, 70]
		System.out.println(list);//[0, 1, 2, 30, 40, 50, 60, 70, 8, 9]
		subList.clear();//清空子集也会影响到原集合
		System.out.println(subList);//[]
		System.out.println(list);//[0, 1, 2, 8, 9]
	}
}
		