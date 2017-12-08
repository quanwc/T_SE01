package Map;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Map
 * @author 全文超
 * 2015-08-11 09:57:04
 *
 */
public class MapDemo02 {
	public static void main(String[] args) {
		
		/*
		 * 保存学员的年龄
		 */
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("张三", 22);
		map.put("李四", 17);
		map.put("王五", 35);
		System.out.println(map.put("赵六", 75));//赵六之前还没有存在，没有被替换，返回null
		map.put("阿拉丁", 24);
		map.put("阿拉甲", 59);
		map.put("阿拉乙", 32);
		map.put("阿拉丙", 42);
		
		System.out.println(map.put("赵六", 30));//赵六的名字已经存在，则被被替换，返回75
		//获取赵六的名字
		int age = map.get("赵六");
		System.out.println("age=" + age);//age=30
		
		
		
		
		/*
		 * 查看是否有小明这个人
		 */
		if(map.containsKey("小明")){
			System.out.println("有小明这个人");
		}else{
			System.out.println("没有这个人");
		}
	}
}
