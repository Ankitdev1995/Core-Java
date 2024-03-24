package ArrayList;

public class Employee {
int id;
String name;
String role;
String doj;
double salary;
public Employee() {
	super();
	
}
public Employee(int id, String name, String role, String doj, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.role = role;
	this.doj = doj;
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
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getDoj() {
	return doj;
}
public void setDoj(String doj) {
	this.doj = doj;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", doj=" + doj + ", salary=" + salary + "]";
}

}
