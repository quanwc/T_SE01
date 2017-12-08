package File;
/**
 * 
 * File与RandomAccessFile对文件的创建
 * @author 全文超
 * 2016-07-19 11:08:310
 */
import java.io.File;

public class FileDemo {
	public static void main(String[] args) throws Exception {
		
		/**
		 * 使用RandomAccessFile:
		 * 	  当用"rw"模式声明RandomAccessFile对象时，如果要写入的文件不存在，
		 * 系统会自动创建。
		 * 	  当用"r"模式声明对象，如果文件不存在，系统不会自动创建。控制台会报错。
		 */
//		RandomAccessFile file = new RandomAccessFile("zz.txt", "rw");
//		System.out.println(file.length());
		
		
		
		
		/**
		 * 当使用File对象时：
		 * 		如果该文件已经存在，则file直接引用表示该文件
		 * 		如果文件不存在，系统不会自动创建，需要我们调用createNewFile()方法，才会创建该对象。
		 */
		File file = new File("vv.txt");//如果文件存在，则直接表示该文件。
		System.out.println(file.isFile());//false
		if(!file.exists()){//如果文件不存在，则创建该文件。
			file.createNewFile();
			
		}
	}
}
