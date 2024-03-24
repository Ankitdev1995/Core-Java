package com.ankit.Map_FIlter_Combine;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int empid;
	String empname;
	int salary;
	
	public Employee() {
		
	}

	public Employee(int empid, String empname, int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
	}
	

}
