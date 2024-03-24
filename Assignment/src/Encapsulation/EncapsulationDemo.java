package Encapsulation;

public class EncapsulationDemo {
private int ssn;
private String empName;
private int empAge;

	public int getSsn(){
	return ssn;
	}
	public String getEmpName(){
	return empName;
	}
	public int getEmpAge(){
	return empAge;
	}
	public void setSsn(int ssn){
		this.ssn=ssn;
	}
	public void setEmpName(String empName){
		this.empName=empName;
	}
	public void setEmpAge(int empAge){
		this.empAge=empAge;
}
}

