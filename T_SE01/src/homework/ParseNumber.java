package homework;

import java.util.Scanner;

import org.junit.Test;

/**
 * 将输入的字符串转换为数字
 * @author 全文超
 * 2015-08-06 17:07:51
 *
 */
public class ParseNumber {
	
	/*
	 * 用于验证整数的正则表达式
	 */
	public static final String INTEGER_REGEX = "^[0-9]+$";
	public static final String DOUBLE_REGEX = "^[0-9]+\\.[0-9]+$";
	
	/*
	 * 检查数字
	 */
	@Test
	public void testNumber(){
		
		/*
		 * 1. 创建Scanner用于获取用户输入的内容
		 * 2. 通过整数的正则表达式验证用户输入的字符串是否匹配，若匹配将其转换为整数
		 * 3. 若不匹配(说明已经不是整数)，在通过小小数的正则表达式匹配，若匹配将其转换为小数
		 * 4. 若不匹配(说明不是数字了)，输出提示"不是数字"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("please input the number:");
		//nextLine()用于获取用去用户输入的一行字符串， 以回车为准
		String number = scan.nextLine();
		
		if(number.matches(INTEGER_REGEX)){
			int i = Integer.parseInt(number);
			System.out.println("这是一个整数:" + i);
		}else if(number.matches(DOUBLE_REGEX)){
			double d = Double.parseDouble(number);
			System.out.println("这是一个小数:" + number);
		}else{
			System.out.println("这不是一个数字");
		}
	}
}


/* 
 * 程序运行结果正确：
 * please input the number:
123
这是一个整数:123
please input the number:
123.456
这是一个小数:123.456
please input the number:
123abc
这不是一个数字
 */