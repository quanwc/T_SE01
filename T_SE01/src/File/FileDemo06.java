package File;

import java.io.File;
import java.io.IOException;

/**
 * 在目录中创建文件
 * @author 全文超
 * 2015-08-27 12:33:49
 *
 */
public class FileDemo06 {
	public static void main(String[] args) throws IOException {
		
		/*
		 * 在myDir目录中创建文件test.txt
		 */
		//描述目录
		File dir = new File("myDir");
		File file = new File(dir,"test.txt");
		/*
		 * 构造方法：
		 * 			第一个参数：当前文件所属的目录
		 * 			第二个参数：当前文件的名字
		 */
		
		if(!file.exists()){
			file.createNewFile();
		}
		System.out.println("创建完毕");
	}
}
