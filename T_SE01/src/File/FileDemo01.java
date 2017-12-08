package File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试File对象
 * @author 全文超
 * 2015-08-27 10:53:28
 *
 */
public class FileDemo01 {
	public static void main(String[] args) {
		
		//.表示：当前目录，即就是当前程序所属项目的根目录
		File file = new File("."+ File.separator+"demo.txt");
//		File file = new File("./demo.txt");
		System.out.println(file);
		
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		/*
		 * boolean isFile()
		 * 判断当前File描述的是否为一个文件
		 */
		boolean isFile = file.isFile();
		if(isFile){
			System.out.println("是一个文件");
		}else{
			System.out.println("不是一个文件");
		}
		
		
		/*
		 * 判断是否为一个目录
		 * boolean isDirectory()
		 */
		boolean isDirectory = file.isDirectory();
		if(isDirectory){
			System.out.println("是一个目录");
		}else{
			System.out.println("不是一个目录");
		}
		
		
		/*
		 * 查看文件大小，占用的字节量。
		 * long length()
		 * 注：目录无大小 
		 */
		long length = file.length();
		System.out.println("占用" + length + "字节");
		
		
		
		/*
		 * 查看File描述文件或目录是否真实存在
		 * boolean exists()
		 */
		boolean exists = file.exists();
		if(exists){
			System.out.println("该文件或该目录存在");
		}else{
			System.out.println("该文件或目录不存在");
		}
		
		
		//查看文件的最后修改时间
		long time = file.lastModified();
		Date date = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		System.out.println("最后修改时间: "+str);
		
	}

	
}


/*
 * 程序运行结果正确：
 * 是一个文件
不是一个目录
占用19字节
该文件或该目录存在
 * */