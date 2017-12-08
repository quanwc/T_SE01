package homework;
/**
 * 
 * @author 全文超
 * 2015-08-06 15:58:47
 *
 */
public class RegDemo01 {
	
	/**
	 *用于验证生份证号的正则表达式 
	 */
	public static final String IDENTITY_CARD = "^\\d{15}(\\d{2}[0-9xX])?$";
	
	
	/**
	 * 用于邮政编码的正则表达式 
	 */
	public static final String ZIP_CODE = "^\\d{6}$";
	
	
	/**
	 * 用于验证手机号的正则表达式
	 * 13***********
	 * 158**********
	 * 159**********
	 */
	public static final String PHONE_NUMBER = "^1(3\\d|5[89])\\d{8}$";
	
	/**
	 * 验证生份证号
	 * @param str		身份证字符串
	 * @return			身份证格式正确返回true
	 */
	public static boolean checkIdentityCard(String str){
		return str.matches(IDENTITY_CARD);
	}
	
	public static void main(String[] args) {
		boolean tf = checkIdentityCard("110104198811212012");
		System.out.println("是否是身份证号:" + tf);//true
	}
}
