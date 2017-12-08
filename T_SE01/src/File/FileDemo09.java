package File;

import java.io.File;

/**
 * 查看一个目录下的所有子项
 * @author 全文超
 * 2015-08-28 09:39:33
 *
 */
public class FileDemo09 {
	public static void main(String[] args) {
		
		File dir = new File(".");
		if(dir.isDirectory()){
			
			//获取当前目录下的所有子项
			File[] subs = dir.listFiles();
			for(File sub : subs){
				if(sub.isFile()){
					
					//String getName()：获取文件或目录的名字
					//System.out.println("文件:" + sub.getName());
					System.out.println("文件:" + sub);//调用的是sub所在类的toString()方法
				}else{
					System.out.println("目录:" + sub);
				}
			}
		}else{
			System.out.println("这不是一个目录，是一个文件。文件中不包含有子项");
		}
	}
}	
