package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 遍历所有的value：
 * 			Collection values();
 * @author 全文超
 * 2016-07-18 14:36:09
 *
 */
public class MapDemo05 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("李四光", 20);
		map.put("王麻子", 54);
		map.put("小胖", 50);
		map.put("惊云", 22);
		
		
		/*
		 *遍历所有的value：
		 *	Collection values()，该方法会将所有的value存入一个集合后返回。 
		 */
		Collection<Integer> values =  map.values();
		for(Integer value : values){
			System.out.println(value);
		}
	}
}
