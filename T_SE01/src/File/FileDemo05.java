package File;

import java.io.File;

/**
 * 创建多级目录
 * @author 全文超
 * 2015-08-27 12:23:06
 *
 */
public class FileDemo05 {
	public static void main(String[] args) {
		
		/*
		 * 在当前目录(项目根目录)下创建a/b/c
		 */
		File dir = new File("a"+File.separator + "b"+File.separator + "c");
		
		if(!dir.exists()){
			/*
			 * 与mkdir()的区别在于：该方法会将所有不存在的父目录全部创建出来
			 */
			dir.mkdirs();
		}
		System.out.println("创建完毕");
	}
}
