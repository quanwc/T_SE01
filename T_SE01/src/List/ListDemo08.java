package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author 全文超
 *
 */
public class ListDemo08 {
	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		strList.add("范传奇");
		strList.add("刘苍松");
		strList.add("张飞");
		strList.add("关羽");
		strList.add("类");
		strList.add("欧阳思勇");
		strList.add("Rose");
		strList.add("marry");
		
		//自身提供的比较规则不满足排序要求
		Collections.sort(strList);
		System.out.println(strList);//[Rose, marry, 关羽, 刘苍松, 张飞, 欧阳思勇, 类, 范传奇]
		
		/*
		 * Collections提供了一个重载的sort方法
		 * static void sort(List list, Comparator c)
		 * 		该方法根据给定的比较器对集合元素进行大小比较后，进行自然排序
		 * */
		
		MyComparator c = new MyComparator();
		Collections.sort(strList, c);
		System.out.println(strList);
		//[类, 关羽, 张飞, 刘苍松, 范传奇, Rose, 欧阳思勇, marry]
		
		
		
		/*
		 * 排序后字符多的在前
		 * 使用匿名内部类定义比较器(推荐做法)
		 * 实现了Comparator接口，同时创建了Comparator对象
		 * 
		 * 当我们需要临时使用某一个接口的实现类的实例或一个类的子类实例时，这是我们使用匿名内部类的最佳时机。
		 * 匿名内部类的特点是不需要声明类，且只有一个实例
		 */
		
		Comparator<String> com = new Comparator<String>(){
			@Override
			public int compare(String o1, String o2){
				return o2.length() - o1.length();
			}
		};
		
		Collections.sort(strList, com);
		System.out.println(strList);//[marry, Rose, 欧阳思勇, 刘苍松, 范传奇, 关羽, 张飞, 类]
	}
}



/**
 * 自定义的比较器， 用来比较字符串
 * 规则为字符少的小， 字符多的大
 * 
 * 比较器比较的类型是什么， 泛型就指定什么。
 * @author 全文超
 *
 */
class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o1.length() - o2.length();
	}
	
}