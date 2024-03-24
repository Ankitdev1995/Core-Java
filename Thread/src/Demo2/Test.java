package Demo2;

import java.util.HashSet;

public class Test {
public static void main(String[] args) {
	Employee e1=new Employee(10,"nitin" ,"tester",70000.0f);
	Employee e2=new Employee(11,"pratik" ,"Developer",80000.0f);
	Employee e3=new Employee(12,"aditi" ,"tester",75000.0f);
	Employee e4=new Employee(13,"priti" ,"tester",65000.0f);
	Employee e5=new Employee(10,"nitin" ,"tester",70000.0f);
	
	HashSet<Employee>emplist=new HashSet<Employee>();
	emplist.add(e1);
	emplist.add(e2);
	emplist.add(e3);
	emplist.add(e4);
	emplist.add(e5);
	
	for(Employee e:emplist){
		System.out.println(e);
	}
	
}
}