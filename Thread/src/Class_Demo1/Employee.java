package Class_Demo1;

import java.io.Serializable;

public class Employee implements Serializable,Comparable<Employee>,Cloneable{
private int id;
private String name;
private String Disignation;
private float salary;

public Employee(int id, String name, String disignation, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.Disignation=disignation;
	this.salary = salary;
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
public String getDisignation() {
	return Disignation;
}
public void setDisignation(String disignation) {
	this.Disignation = disignation;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
	@Override
		public int compareTo(Employee e) {
		if(this.getId()>e.getId())
			return 1;
		else if(e.getId()>this.getId()){
			return -1;
		}else
		return 0;
		}
	@Override
		public boolean equals(Object obj) {
			Employee e=(Employee)obj;
			if(
			this.id==e.getId()&&
			this.name.equals(e.getName())&&
			this.Disignation.equals(e.getDisignation())&&
			this.getSalary()==e.getSalary()
			)
			return true;
			else
			return false;
	
	}
	@Override
		public int hashCode() {
			return super.hashCode();
		
		}
	@Override
		public Object clone() throws CloneNotSupportedException {
			
			return super.clone();
		}
	@Override 
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Disignation=" + Disignation + ", salary=" + salary + "]";
	}

}
