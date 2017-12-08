package API;
/**
 * 测试反转字符串：
 * 				StringBuilder replace()		返回反转后的对象
 * @author 全文超
 * 2015-08-04 11:27:22
 *
 */
public class StringBuilderDemo05 {
	public static void main(String[] args) {
		
		//使用反转测试回文
		StringBuilder builder = new StringBuilder("上海自来水来自海上");
		
		String str = builder.toString();
		
		//反转
		builder.reverse();
		String str2 = builder.toString();
		
		if(str2.equals(str)){
			System.out.println("是回文");
		}else{
			System.out.println("不是回文");
		}
	}
}
/*
 * 程序运行结果正确：
 * 是回文
 * */