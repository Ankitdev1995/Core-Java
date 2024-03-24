package ArrayList;

public class Employee1 {
int empid;
String ename;
String disignation;
double salary;


public Employee1(int empid, String ename, String disignation, double salary) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.disignation = disignation;
	this.salary = salary;
}
public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public String getDisignation() {
	return disignation;
}

public void setDisignation(String disignation) {
	this.disignation = disignation;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee1 [empid=" + empid + ", ename=" + ename + ", disignation=" + disignation + ", salary=" + salary
			+ "]";
}
}
