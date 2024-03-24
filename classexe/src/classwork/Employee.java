package classwork;

public class Employee {
int empid;
String ename;
float basic_salary;
float salary;
float DA;
float HRA;

void salary (){
	DA= 0.10f*basic_salary;
	HRA=0.15f*basic_salary;
	salary = basic_salary + DA + HRA ;
	
	
}
}
