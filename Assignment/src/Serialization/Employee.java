package Serialization;

import java.io.Serializable;
//Write a java Program for Serialization
public class Employee implements Serializable{
	int empno;
	String empname;
	int empsal;

	public int getEmpNo(){
		return empno;
	}
	public void setEmpNo(int empno){
		this.empno=empno;
	}
	public String getEmpName(){
		return empname;
	}
	public void setEmpName(String empname){
		this.empname=empname;
	}
	public int getEmpSal(){
		return empsal;
	}
	public void setEmpSal(int empsal){
		this.empsal=empsal;

	}
}



