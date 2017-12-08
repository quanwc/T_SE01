package File;

import java.io.File;

/**
 * 删除目录
 * @author 全文超
 * 2015-08-27 16:40:32
 *
 */
public class FileDemo07 {
	public static void main(String[] args) {
		
		/*
		 * 删除目录：myDir
		 */
		File dir = new File("myDir");
		if(dir.exists()){
			/*
			 * 要想删除目录，必须保证该目录是空的
			 */
			dir.delete();
		}
		System.out.println("删除完毕");
	}
}
