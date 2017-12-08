package Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Map 查找表
 * 		put(), get()
 * 内部可以看做是一个多行两列的表格
 * 
 * 元素以Key-Value的形式保存
 * 常用实现类： HashMap
 * @author 全文超
 * 2015-08-10 19:42:53
 *
 */
public class MapDemo01 {
	public static void main(String[] args) {
		
		/*
		 * Map要求有两个泛型，分别用来约束key的类型与value的类型
		 * 
		 * 什么时候会使用Map：
		 * 通常我们保存一组数据，而每个数据若需要说明，则可以使用Map
		 * key:   保存说明
		 * value: 保存数据
		 * 
		 * 
		 * V map.put(K k, V v)方法:
		 * 	若key在map中不存在，返回NULL
		 * 	若key在map中存在，由于mapkey不允许重复，所以会将这次存入的value去替换原有的value，
		 * 并将原有被替换的value返回。
		 */
		Map<String, Integer> map = new HashMap<String, Integer>();

		
		/*
		 * 统计各个监测站的pm2.5的最大值      
		 */
		String pm25 = "农展馆=423, 东四=378, 丰台花园=406,"+
				"天坛=322, 海淀区万柳=398, 官园=406,"+
				"通州=366, 昌平镇=248, 怀柳镇=306,"+
		  		"定陵=231, 前门=422, 永乐店=368, 古城=268,"+
				"昌平镇=423, 怀柳镇=267, 定陵=277,"+
				"永乐店=285, 秀水街=277, 农展馆=348,"+
				"丰台花园=179, 天坛=277, 海淀区万柳=270,"+
				"前门=299, 东四=356, 官园=268, 通州=315";
		
		//将所有监测点数据存入map
		/*
		 * 1.根据"="或者","拆分
		 * 2.循环数组
		 * 		第1个元素和第2个元素是一对
		 * 		第3个元素和第4个元素是一对
		 */
		//1.
		String [] arr = pm25.split("[,=]");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);//52
		
		for(int i=0; i<arr.length; i+=2){
			String name = arr[i];
			int pm = Integer.parseInt(arr[i+1]);
			//将每一项存入map中
			
			/*
			 * 首先查看当前站点名字石佛在map中已经存在了。 
			 *   若站点名作为key在map中不存在：
			 *   	-直接将站点与pm存入即可
			 *   若站点名已经存在：
			 *   	-将map中给站点的pm值取出
			 *   	-与这次的pm比较，谁大存入map
			 */
			/*
			 * 查看map中是否包含给定的key
			 * boolean containsKey(K k)
			 * 		-这里检查也是使用key的equals方法来比较的
			 */
			if(map.containsKey(name)){
				/*
				 * 根据key获取value： V get(K k)
				 * 根据给定的key获取map中对应的value
				 * 若key在map中不存在，则返回值为null
				 */
				int oldpm = map.get(name);
				if(oldpm < pm){
					//将新的pm替换之前的pm，返回的是被替换的值
					map.put(name, pm);
				}
				
			}else{
				//若key值不存在，则返回中为null(没有值被替换)
				map.put(name, pm);
			}
			map.put(name, pm);
		}
		System.out.println(map);
		/*
		 * int size()
		 * 查看Map键值对
		 */
		System.out.println(map.size());
		/*
		 * put方法会将给定的key与value存入map
		 * key值不允许重复，当若给定的key已经在map中存在，则替换value
		 * put方法的返回值为被替换的value	
		 */

	
	
	
		//Map的存、取顺序不一致
		//LinkedHashMap是有序的map，HashMap内部有一个链表，存入数据和取出数据的顺序一致
		Map<String, Integer> map1 = new LinkedHashMap<String, Integer>();
		map1.put("语文", 98);
		map1.put("数学", 91);
		map1.put("英语", 48);
		map1.put("生物", 96);
		map1.put("化学", 79);
		System.out.println(map1);
	
		
		//替换value
		Integer old = map1.put("语文", 100);
		System.out.println(map1);
		System.out.println(old);
	
	}
}
