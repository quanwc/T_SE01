package API;
/**
 * 字符串与字符数组：
 * 				·将字符串变为字符数组：char[] toCharArray()
 * 				·将字符数组变为字符串：String(数组)
 * 								 String(数组，第一个索引的下标，长度)
 * @author 全文超
 * 2015-08-02 21:35:39
 *
 */
public class StringDemo11 {
	public static void main(String [] args){
		
		/*
		 * 将字符串变为字符数组
		 * */
		String str = "helloworld";
		char c[] = str.toCharArray();//将字符串变为字符数组
		for(int i=0; i<str.length(); ++i){
			System.out.print(c[i] + "、");//h、e、l、l、o、w、o、r、l、d、
		}
		System.out.println();
		
		
		/*
		 * 将字符数组变为字符串：
		 * 			有两种方法，都是调用String的构造
		 * */
		char[] ch = {'a', 'b', 'c', 'd', 'e'};
		String st = new String(ch);//调用String的构造，将全部字符数组变为字符串
		System.out.println(st);//abcde
		
		st = new String(ch, 2, 3);
		System.out.println(st);//cde
	}
}
