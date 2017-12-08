package File;

import java.io.File;

/**
 * 使用File创建一个目录
 * @author 全文超
 * 2015-08-27 12:13:04
 *
 */
public class FileDemo04 {
	public static void main(String[] args) {
		
		//创建一个File对象表示目录
		//注：  ./可以省略不写，此时不写也表示在在当前项目根目录下
		File dir = new File("myDir");
		//等价于: File dir = new File("." + File.separator + "myDir");
		
		if(!dir.exists()){//必要判断
			dir.mkdir();
		}
		System.out.println(dir.getName());
		System.out.println("创建目录完毕");
	}
}
