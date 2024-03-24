package ArrayList;

public class Doctor {
int dRegNo;
String dName;
String specialization ;
double salary;
public Doctor(int dRegNo, String dName, String specialization, double salary) {
	super();
	this.dRegNo = dRegNo;
	this.dName = dName;
	this.specialization = specialization;
	this.salary = salary;
}
public int getdRegNo() {
	return dRegNo;
}
public void setdRegNo(int dRegNo) {
	this.dRegNo = dRegNo;
}
public String getdName() {
	return dName;
}
public void setdName(String dName) {
	this.dName = dName;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Doctor [dRegNo=" + dRegNo + ", dName=" + dName + ", specialization=" + specialization + ", salary=" + salary
			+ "]";
}


}
