package API;

/**	1. 给类注释	
 * 文档注释一般会在： 类， 方法， 常量上使用
 * 
 * 该类的作用是用于测试javaDemo1
 * 
 * 2015-08-01 20:18:45
 * 
 * @author 全文超			   表明作者
 * @version 1.0        	   表明版本
 * @see java.lang.String 该类可以参考String
 * @since	JDK1.0    	   从什么时候开始
 */
public class Annotation {

	/**
	 * 3. 给常量注释
	 * 问候语		解释常量的作用
	 */
	public static final String HELLO_STR = "你好";
	
	/**2. 给方法注释
	 * 获取打招呼的字符串
	 * 
	 * @param name	指定向谁打招呼  			参数的解释		
	 * @return		返回问候的字符串内容		
	 */
	public String hello(String name){
		return name + ", 你好";
	}
}
