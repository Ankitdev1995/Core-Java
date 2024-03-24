package Room;

public class Employee {
private int empno;
private String ename;
private int salary;
public Employee(int empno, String ename, int salary) {
	
	super();
	this.empno = empno;
	this.ename = ename;
	this.salary = salary;
}
public int getEmpno() {
	return empno;
}
public String getEname() {
	return ename;
}
public int getSalary() {
	return salary;
}
@Override
public String toString() {
	return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
}


}
