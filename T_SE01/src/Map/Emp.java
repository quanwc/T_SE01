package Map;
/**
 * 重写hashCode
 * 				右键->Source->Generate hashCode and equals
 * 	通常hashCode与equals方法一同重写
 * @author 全文超
 *2015-08-11 10:57:26
 *
 */
public class Emp{//Comparable也支持泛型

	private String name;
	private int age;
	private int salary;
	
	public Emp(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	
}
