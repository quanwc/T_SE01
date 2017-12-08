package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

/**
 * 栈：push()、pop()方法
 *	用于保存一组数据，存取元素遵循先进后出原则。
 *	通常当我们对一系列操作可追溯，我们会使用栈来保存 	
 * @author 全文超
 * 2015-08-10 18:52:09
 *
 */
public class StackDemo01 {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<String>();
		
		/*
		 * 双端队列：是指队列两端都可以进出队，但如果只从一边进出队，就实现了栈。
		 * 栈在java中没有专门的数据结构，使用双端队列Deque来实现的。
		 * 双端队列为了实现栈的效果，提供了两个方法：push()、pop()
		 * 
		 * 向栈中存入元素：
		 * 		push()方法, (压入，压栈)
		 */
//		stack.offer("123");
		stack.push("a1");
		stack.push("a2");
		stack.push("a3");
	
		System.out.println(stack);//[a3, a2, a1]
		
		
		//引用栈顶元素，并没有删除
		String str = stack.peek();
		System.out.println("栈顶:" + str);//栈顶:a3
		
		
		while(stack.size() > 0){
			//获取栈顶元素，并从栈顶删除该元素
			str = stack.pop();
			System.out.print(str + ",");//a3,a2,a1,
		}
		System.out.println("\n" + stack);//[]

	}
}
