package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 集合的排序：
 * 		只排序List集合，Set集合大部分实现是无序的，对其排序没有意义。
 * @author 全文超
 * 2015-08-09 16:17:50
 *
 */
public class ListDemo06 {
	public static void main(String[] args) {
		
		/**
		 * Collections是集合的工具类
		 * 使用Collections常用于排序集合
		 */
		
		//在集合中生成10个100以内的随机数
		List<Integer> list = new ArrayList<Integer>();
		
		Random random = new Random();
		
		for(int i=0; i<10; i++){
			int num = random.nextInt(100);
			list.add(num);
			//可以合并为一句话：list.add(random.nextInt(100))
		}
		System.out.println(list);//[7, 42, 67, 92, 26, 91, 12, 27, 67, 19]
		
		
		/**
		 * Collections.sort(List list)
		 * 
		 * 集合的排序是针对List集合而言的。对Set集合排序没有意义，Set集合本身是无序的，排完了还是无序的
		 * 对List集合进行自然排序(由小到大)
		 * 
		 * 想使用sort排序，就要求：集合中的元素必须具有可比较性，即能比较出大小。
		 * 字符串，整数可以排序
		 */
		Collections.sort(list);
		System.out.println(list);//[7, 12, 19, 26, 27, 42, 67, 67, 91, 92]
	}
}
