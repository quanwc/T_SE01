package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 将数组转为集合
 * 			只能转为List集合，不能转为Set集合。 Set集合不允许重复，如果转的话可能丢东西。
 * 			转换后的集合不能增删元素，可以修改，修改集合元素相当于修改数组对应的元素。
 * @author 全文超
 * 2015-08-09 15:48:18
 *
 */
public class ListDemo05 {
	public static void main(String[] args) {
		
		String[] array = {"a", "b", "c"};
		System.out.println(Arrays.toString(array));//[a, b, c]
		
		
		/**
		 * Arrays的asList方法，可以将数组转换为List集合
		 * 将数组转换为集合后，该集合是只读的。不要对它进行增删元素，否则可能出错误。
		 * 对集合不能进行增删元素，但是可以修改元素。	注：修改元素会影响原数组
		 */
		List<String> list = Arrays.asList(array);
		System.out.println(list);//[a, b, c]
//		list.add("d");//编译通过，运行出错。不可以增加元素
		//可以new一个新集合，把这个数组集合添加到新集合中去。
		
//		list.remove(0);//编译通过，运行出错。不可以删除元素
		
//		不可增删，可以修改
		list.set(0, "f");//修改集合元素等价于修改数组元素
		System.out.println(list);//[f, b, c]
		System.out.println("数组:" + Arrays.toString(array));//数组:[f, b, c]
		System.out.println("======");
		
		//想添加新元素，要创建新集合
		List<String> newList = new ArrayList<String>();
		newList.addAll(list);
		newList.add("d");
		System.out.println(newList);//[f, b, c, d]
		
		System.out.println("===========");
		
		/*
		 * 复制构造器：
		 * 		所有的集合都支持一个待用Collection参数的构造方法，可以在创建当前集合的同时将给定
		 * 	的集合中的所有元素存入。
		 * 	
		 * 注：
		 * 	传入的集合无需和要创建的集合同类型：
		 *		Set<String> set = new HashSet<String>(list);
		 */
		List<String> ll = new ArrayList<String>(list);//在new的同时将list集合传入
		ll.add("hahaha");
		System.out.println(ll);
		
		
		
	}
}
