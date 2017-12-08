package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 测试集合的批量操作:
 * 					addAll()
 * 					containsAll()
 * @author 全文超
 * 2015-08-08 16:57:57
 *
 */
public class CollectionDemo05 {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add("java");
		c.add("cpp");
		c.add("php");
		c.add("c#");
		c.add("objective-c");
		
		Collection c2 = new ArrayList();
		
		//将c集合中的所有元素添加到c2集合中
		System.out.println(c2);//[]
		c2.addAll(c);
		System.out.println(c2);//[java, cpp, php, c#, objective-c]
		
		boolean containsAll = c2.containsAll(c);//5
		System.out.println(c2.size());
		System.out.println(containsAll);//true
		
		
		Collection c3 = new ArrayList();
		c3.add("java");
		c3.add("cpp");//c++,c plus plus
		//查看c集合中是否包含c3中的所有元素
		boolean bo = c.containsAll(c3);
		System.out.println("c是否包含c3所有元素:" + bo);//c是否包含c3所有元素:true
		//查看c集合中是否包含c3中的所有元素,同样要比较equals()方法，元素是字符串类型，字符串的equals()方法比较的是内容。
		//所以包含所有，结果为true。
	}
}
