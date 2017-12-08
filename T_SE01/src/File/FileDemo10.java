package File;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取一个目录下满足条件的子项
 * @author 全文超
 * 2015-08-28 09:57:50
 *
 */
public class FileDemo10 {
	public static void main(String[] args) {
		
		/*
		 * 获取当前目录下所有的文本文件
		 * 目标：获取名字是以".txt"结尾的
		 */
		File dir = new File(".");//"."表示当前目录
		MyFilter filter = new MyFilter();
		
		/*
		 * 重载的listFiles方法:
		 * File [] listFiles(FileFilter filter)
		 * 返回当前目录下满足给定过滤器条件的子项
		 */
		File [] subs = dir.listFiles(filter);
		
		System.out.println("===========");
		for(File sub : subs){
			System.out.println(sub.getName());
		}
	}
}


//文件过滤器
class MyFilter implements FileFilter{

	@Override
	/*
	 * 该方法用来检查参数File对象是否符合要求
	 * 
	 */
	public boolean accept(File file) {//在accept方法中定义过滤的规则。需要保留的返回true，不需要的返回false
		String name = file.getName();
		System.out.println("过滤:" + name);
		return name.endsWith(".txt");
	}
	
}


/*
 * 程序运行结果正确：
 * 过滤:.classpath
过滤:.project
过滤:.settings
过滤:a
过滤:bin
过滤:doc
过滤:myDir
过滤:q
过滤:src
过滤:test.txt
===========
test.txt
 * */
