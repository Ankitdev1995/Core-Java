package Class_Work_sort;

public class Employee implements Comparable <Employee>{
int id;
String name;
String role;
String designation;
float salary;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", designation=" + designation + ", salary="
			+ salary + "]";
}
public Employee(int id, String name, String role, String designation, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.role = role;
	this.designation = designation;
	this.salary = salary;
}
@Override
public int compareTo(Employee p1) {
	
	if (this.id>p1.id)
		return 1;
	else if(p1.id>this.id)
		return -1;
	else 
		return 0;
}
}
