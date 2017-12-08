package API;
/***
 * 测试字符串检索方法:
 * 					int indexOf()	返回指定字符串的下标
 * @author 全文超
 * 2015-08-02 15:25:04
 */
public class StringDemo04 {
	public static void main(String [] args){
		
		String str = "I can because i think i can";
		
		//返回当前字符串中第一次出现can的首字母的位置，下标从0开始
		int index = str.indexOf("can");
		System.out.println(index);//2
		
		
		//当前字符串中最后一次出现can的位置
		int lastIndex = str.lastIndexOf("can");
		System.out.println(lastIndex);//24
		
		
		//indexOf()方法支持重载，从指定位置开始检索
		//eg:查找从because之后第一次出现can的位置，返回的也是can的首字母位置
		index = str.indexOf("can", 6);
		System.out.println(index);//24
		
		
		//java严格区分大小写，当找不到指定字符串时，返回-1。因为从0(包括0)到后面都有可能找到指定的字符串
		index = str.indexOf("Can");
		System.out.println(index);//-1
	}
}
