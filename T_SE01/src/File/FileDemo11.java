package File;

import java.io.File;

/**
 * 将给定的File对象删除
 * 		不论该File对象是文件还是目录，或者该目录中包含内容
 * 
 * 使用递归实现：
 * 		不能使用for循环实现，因为不知道循环的次数，所以只能使用递归来实现。
 * @author 全文超
 * 2016-07-19 09:35:48
 *
 */
public class FileDemo11 {
	public static void main(String[] args) {
		
		
		File dir = new File("q");
		deleteFile(dir);
	}
	
	
	
	/**
	 * 将给定的File对象删除
	 * @param file
	 */
	public static void deleteFile(File file){
		if(file.isDirectory()){
			File[] subs = file.listFiles();
			for(File sub : subs){
				//将每一个子项删除
				deleteFile(sub);
			}
			//file.delete();
		}else{
			//file.delete();
		}
		
		file.delete();
	}
	
	
}
