package Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 测试队列: offer()、poll()方法
 * 队列同样用于保存一组数据，但是不允许随意的访问其中的元素
 * 队列存取元素遵循先进先出原则(FIFO)
 * @author 全文超
 * 2015-08-10 18:13:34
 *
 */
public class QueueDemo01 {
	public static void main(String[] args) {
		
		//队列也支持泛型，用来约束队列中元素的类型
		//LinkedList不仅实现了List接口，同时也实现了Queue接口
		Queue<String> queue = new LinkedList<String>();
		
		//向队列中添加元素
		queue.offer("ab");
		queue.offer("c");
		queue.offer("d");
		
		System.out.println(queue);//[ab, c, d]
		
		
		//peek：只是引用队首元素，并不对其做出队操作(不将其删除)
		String str = queue.peek();
		System.out.println("队首元素:" + str);//队首元素:ab
		System.out.println(queue);//[ab, c, d]
		
		
		
		/*
		 * int size()
		 * 		返回队列的元素数量
		 */
		while(queue.size() > 0){//出队的同时队列的size会改变
			//获取并删除队列中队首元素
			str = queue.poll();
			System.out.print(str + ",");//ab,c,d,
		}
		//这样遍历队列是一次性的，遍历一次之后队列为空
		System.out.println("\n" + queue);//[]
	}
}
