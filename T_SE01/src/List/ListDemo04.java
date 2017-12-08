package List;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合转换为数组
 * @author 全文超
 * 2015-08-09 14:00:55
 *
 */
public class ListDemo04 {
	public static void main(String[] args) {
		
		/**
		 * Collection中定义的方法，所有所有集合都可以转
		 * Object[] toArray()
		 */
		Collection<String> c = new ArrayList<String>();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		Object[] arr = c.toArray();
		//输出第一个字符串长度：需要转型，不方便
		String str = (String)arr[0];
		System.out.println(str.length());//1

		
		//所以我们使用toArray()重载的方法：
		/**
		 * 重载toArray()：
		 * 			该方法会检查我们传入的数组，若传入的数组长度可以保存集合中的元素，就使用这个数组
		 * 		若传入的数组不能保存集合中所有元素，则按照我们传入数组的类型创建一个新数组,这个数组的长度，就是我们集合中元素的个数
		 */
		String [] arrays = c.toArray(new String[0]);//要求我们传入一个数组
		//我想转成String类型的，在()里new String类型的数组，给定长度
		System.out.println(arrays.length);//4
		str = arrays[0];
		System.out.println(str);//a
	}
}
