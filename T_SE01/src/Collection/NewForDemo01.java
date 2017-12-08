package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 增强for循环:
 * 		也叫新循环，for each
 * 该循环只为了遍历集合或数组，不能替代传统for循环的工作。
 * @author 全文超
 * 2015-08-08 19:21:33
 *
 */
public class NewForDemo01 {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add("java");
		c.add("cpp");
		c.add("php");
		c.add("c#");
		c.add("objective-c");
		
		//新循环遍历集合
		for( Object o:c){//从集合中顺序取初每一个元素。每次将集合中的元素赋给o，o就是集合或数组中的元素，使用o就可以了。
			String str = (String)o;
			System.out.print(str + " ");
		}
		System.out.println();
		
		//新循环遍历数组
		String [] array = {"a", "b", "c", "d", "e", "f", "g"};
		for(int i=0; i<array.length; i++){
			String str = array[i];
			System.out.print(str + " ");
		}
		System.out.println();
		//a b c d e f g 
		
		
		
		for( String s : array){
			System.out.print(s + " ");
		}
		//a b c d e f g 
		
		
		for(Object o : c){
			String str = (String)o;
			System.out.println(str);
			
			/*
			 * 由于新循环遍历集合的底层还是迭代器，所以不能通过集合的方法删除元素。
			 */
//			if(str.indexOf("c")!=-1){
//				c.remove(str);
//			}
		}
	}
}

/*
 *程序运行结果正确：
 *java cpp php c# objective-c  
 * */