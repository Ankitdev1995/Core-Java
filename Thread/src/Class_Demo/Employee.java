package Class_Demo;

import java.io.Serializable;

public class Employee implements Serializable,Comparable,Cloneable{
private int id;
private String name;
private String designation;
private float salary;
public Employee(int id, String name, String designation,float salary) {
	super();
	this.id = id;
	this.name = name;
	this.designation = designation;
	this.salary=salary;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getdesignation() {
	return designation;
}
public void setdesignation(String designation) {
	this.designation = designation;
}
public float getsalary() {
	return salary;
}
public void setsalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
}
@Override
	public int compareTo(Object o) {
			Employee s = (Employee)o;
		if(this.id>s.id)
			return 1;
			else if(this.id<s.id){
				return -1;
			}
			else
		return 0;
	}
	@Override
		public Object clone() throws CloneNotSupportedException {
			return id;
		}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(salary);
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
		Employee other = (Employee) obj;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}
	
	}
