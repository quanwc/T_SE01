package File;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建文件
 * @author 全文超
 * 2015-08-27 11:43:56
 *
 */
public class FileDemo02 {
	public static void main(String[] args) throws IOException {
		
		/*
		 * 在当前项目根目录下创建文件demo.txt
		 */
		//1.使用一个File对象描述该文件
		File file = new File("." + File.separator + "demo.txt");
		
		//2.判断该文件是否在硬盘中不存在，不存在就创建该文件
		if(!file.exists()){
			//创建该文件
			file.createNewFile();
			System.out.println("该文件不存在！");
		}else{
			System.out.println("该文件已存在！");
		}
		
		System.out.println("创建完毕");
	}
}
