package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 遍历所有的键值对：
 * 		Set entrySet()
 * @author 全文超
 * 2015-08-11 11:45:00
 *
 */
public class MapDemo04 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("李四光", 20);
		map.put("王麻子", 54);
		map.put("小胖", 50);
		map.put("惊云", 22);
		
		/*
		 * 遍历所有的key,value键值对 
		 * Set entrySet()
		 *  	该方法会将当前Map中每一组键值对存入一个Entry实例中，
		 * 然后将每一个Entry实例存入一个Set集合后返回。所以遍历集合中的Entry实例，再分别获取
		 * key，value就达到了遍历每一组键值对的目的。
		 */
		
		Set<  Entry<String, Integer>  > entrySet = map.entrySet();

		//使用新循环对其遍历
		for( Entry<String, Integer> entry: entrySet){
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + ", " + value);
		}
	}
}


/*
 * 程序运行结果正确：
 * 小胖, 50
惊云, 22
王麻子, 54
李四光, 20
 */
