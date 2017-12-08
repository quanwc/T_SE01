package File;

import java.io.File;
import java.io.IOException;

/**
 * 在一个不存在的目录中创建文件
 * @author 全文超
 * 2015-08-27 16:48:10
 *
 */
public class FileDemo08 {
	public static void main(String[] args) throws IOException {
		
		/*
		 * q/w/e/r/t/test.txt
		 * 在上述目录中创建文件test.txt
		 */
		File file = new File("."+File.separator+"q" +
							"."+File.separator+"w"	+
							"."+File.separator+"e"	+
							"."+File.separator+"r"	+
							"."+File.separator+"t"	+
							"."+File.separator+ "test.txt"
							);
		
		 
		
		/*
		 * File getParentFile()
		 * 获取当前File(文件)的父目录，即就是获取test.txt文件的父目录:t
		 */
		File parent = file.getParentFile();//t这个目录
		if(!parent.exists()){
			parent.mkdirs();
		}
		if(!file.exists()){
			file.createNewFile();
		}
		
		System.out.println("创建完毕");
	}
}
