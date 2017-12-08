package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型， 也称参数化类型：
 * 					在使用一个类的时候，动态的传入一个或多个类型，来指定该类属性，
 * 				参数，以及返回值的类型
 * @author 全文超
 *
 */
public class CollectionDemo07 {
	public static void main(String[] args) {
		
		//集合中什么都可以存，泛型在集合中的使用是用来约束集合元素的类型
		Collection<String> c = new ArrayList<String>();
		c.add("java");
//		c.add(1);
//		c.add(new Date());
		c.add("php");
		c.add("c#");
		
		
		//使用新循环实现
		for(String o: c){
//			System.out.print(o.length());
			System.out.println(o);
		}
		
		/*
		 * 迭代器也支持泛型。迭代器指定泛型的类型应该于它遍历的集合的泛型类型一致
		 */
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			String str = it.next();
		}
	}
}
