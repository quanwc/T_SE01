package homework;
/**
 * 员工类
 * @author 全文超
 * 2015-08-06 16:33:37
 *
 */
public class Emp {
	private String name;
	private int age;
	private char gender;
	private double salary;
	public Emp(String name, int age, char gender, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	
	@Override
	public String toString(){
		return name + ", " + age + ", " + gender + ", " + salary;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(obj == this){
			return true;
		}
		
		//相同类型才有可比性
		if(obj instanceof Emp){
			Emp emp = (Emp)obj;
			
			return emp.name.equals(this.name);
		}else{
			return false;
		}
	}
	
}
