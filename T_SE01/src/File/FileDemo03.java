package File;

import java.io.File;

/**
 * 删除一个文件
 * @author 全文超
 * 2015-08-27 11:58:51
 *
 */
public class FileDemo03 {
	public static void main(String[] args) {
		
		/*
		 * 删除项目根目录下的test.txt文件
		 * boolean delete()
		 */
		File file = new File("demo.txt");//文件在项目根目录下，所以直接写文件名
		
		if(file.exists()){
			//删除File对象所表示的文件或目录
			file.delete();
		}
		System.out.println("删除成功");
	}
}
