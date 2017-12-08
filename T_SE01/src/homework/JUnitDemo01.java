package homework;

import org.junit.Test;



/**
 * 获取一个字符串中最后一个"/"后的字符序列
 * 没有main方法，使用JUnit来测试代码。
 * @author 全文超
 * 2015-08-04 15:57:16
 *
 */
public class JUnitDemo01 {
	
	@Test//想测试那个方法， 就在那个方法前加：@Test
	public void work(){
		String str = "someapp/manager/emplist.action";
		/*
		 * 1. 获取最后一个"/"的位置
		 * 2. 计算"/"后面第一个字符的位置
		 * 3. 从该位置开始截取到末尾
		 */
		
		int index = str.lastIndexOf("/");
		index += 1;
		str = str.substring(index);
		System.out.println(str);//emplist.action
	}
}

