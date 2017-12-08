package homework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 测试有序的Map：linkedHashMap
 * @author 全文超
 * 2015-08-11 12:56:39
 *
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		
		//普通的HashMap
		Map<String, Integer> map = new HashMap<String , Integer>();
		
		//有序的HashMap,存取顺序是一致的
		Map<String, Integer> linkedMap = new LinkedHashMap<String, Integer>();

		
		map.put("张三", 1);
		map.put("王二", 2);
		map.put("李四光", 3);
		map.put("王五", 4);
		
		linkedMap.put("张三", 1);
		linkedMap.put("王二", 2);
		linkedMap.put("李四光", 3);
		linkedMap.put("王五", 4);
		
		//遍历普通Map
		Set< Entry<String, Integer> > set1 = map.entrySet();
		
		//遍历有序的Map
		Set< Entry<String, Integer> > set2 = linkedMap.entrySet();
		
		
		//遍历输出
		for(Entry<String, Integer> entry:set1){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("=========================");
		for(Entry<String, Integer> entry: set2){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}

/*
 * 程序运行结果正确：
 * 王二:2
张三:1
李四光:3
王五:4
=========================
张三:1
王二:2
李四光:3
王五:4
 * */