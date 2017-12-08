package homework;

import java.util.HashMap;
import java.util.Map;

/**
 * 统计一句话中每个字符出现的个数
 * @author 全文超
 * 2015-08-11 12:26:09
 *	
 */

public class Number {
	public static void main(String[] args) {
		
		String str = "good good study, day day up";
		/*
		 * 保存每个字符出现的次数
		 * 使用HashMap存储
		 * key：     出现的字符
		 * value：该字符出现的次数
		 * 
		 * 1.循环一下操作
		 * 2.获取每一个字符
		 * 3.将该字符存入Map中，会出现两种情况
		 * 		i>该字符作为key在Map中不存在
		 * 		  该字符作为key存入map，value值为1
		 * 		ii>该字符作为key在Map中已经存在
		 * 		  将其对应得value值取出，累加1后再存入
		 */
		
		
		char chr = 1;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++){
			chr = str.charAt(i);
			if(!map.containsKey(chr)){
				map.put(chr, 1);
			}else{
//				int num = map.get(chr);
//				num += 1; 
//				map.put(chr, num);
				map.put(chr, map.get(chr) + 1);
			}
		}
		System.out.println(map);
	}
}
