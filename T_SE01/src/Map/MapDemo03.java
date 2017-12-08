package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 遍历Map中所有的key:
 * 		Set keySet()
 * @author 全文超
 * 2015-08-11 11:33:56
 *
 */
public class MapDemo03 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("张三", 22);
		map.put("王二小", 22);
		map.put("李四光", 22);
		map.put("王麻子", 22);
		
		
		/*
		 * 遍历所有的key
		 * 		Set keySet()	(Map中的key值不重复，所以返回Set集合。)返回一个Set集合。
		 * 该方法会将Map中所有的key存入一个Set集合后返回， 所以遍历该集合就是遍历所有的key。
		 */
		Set<String> keys = map.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext()){
			System.out.println("key:" + it.next());
		}
		
		
		//新循环也是迭代器，也可以遍历
		for(String key : keys){
			System.out.println("key:" + key);
		}
	}
}
