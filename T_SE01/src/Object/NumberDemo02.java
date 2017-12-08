package Object;
/**
 * 包装类的功能：
 * 			 获取它所对应的基本类型的取值范围
 * @author 全文超
 * 2015-08-05 18:26:26
 *
 */
public class NumberDemo02 {
	public static void main(String[] args) {
		
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		System.out.println("maxInt:" + maxInt);
		System.out.println("minInt:" + minInt);
		
		short maxShort = Short.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		System.out.println("maxShort:" + maxShort);
		System.out.println("minShort:" + minShort);
	}
}
/*
 * 程序运行结果正确：
 * maxInt:2147483647
minInt:-2147483648
maxShort:32767
minShort:-32768
 * */