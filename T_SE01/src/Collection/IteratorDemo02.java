package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历的过程中从集合中删除元素
 * @author 全文超
 * 2015-08-08 18:54:36
 *
 */
public class IteratorDemo02 {
	public static void main(String[] args) {
				
		Collection c = new ArrayList();
		c.add("java");
		c.add("cpp");
		c.add("php");
		c.add("c#");
		c.add("objective-c");
		System.out.println(c);//[java, cpp, php, c#, objective-c]
		/*
		 * 将集合中以"c"开头的元素删除
		 */
		Iterator it = c.iterator();
		while(it.hasNext()){//问
			String str = (String)it.next();//取
			
			if(str.startsWith("c")){
				
				//迭代过程只能使用迭代器的remove方法，而不能使用集合的remove方法
//				c.remove(str);
				it.remove();//不用传参，删除的是刚刚拿到的str
//				it.remove();//一次next后只能调用一次remove
			}
		}
		System.out.println(c);//[java, php, objective-c]
	
	
		
		//若想删除包含c的元素：if条件改为：if(str.indexOf("c") != -1)
	
	}
}
