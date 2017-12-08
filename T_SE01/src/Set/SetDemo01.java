package Set;

import java.util.Collection;
import java.util.HashSet;

/**
 * Set集合
 * @author 全文超
 * 2015-08-10 19:15:05
 *
 */
public class SetDemo01 {
	public static void main(String[] args) {
		
		Collection<String> c = new HashSet<String>();
		 
		/*
		 * 所谓无序是指： 添加的顺序和内部存储的顺序不一致
		 * 
		 * 元素内容没有发生变化的情况下，元素在HashSet内部的顺序是一致的。
		 */
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		System.out.println(c);//[3, 2, 1, 4]
		
		
		/*
		 * 重复元素不能被添加到Set集合两次。
		 * 所谓重复还是依靠元素的equals方法决定的。
		 */
		c.add("3");
		System.out.println(c);//[3, 2, 1, 4]
	}
}
