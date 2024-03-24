package Class_Work_sort;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
public static void main(String[] args) {
	Employee e1=new Employee(101,"sandy","HR","Manager",900000);
	Employee e2=new Employee(102,"Harry","Developer","MD",800000);
	Employee e3=new Employee(103,"Jhon","Data Scientist","CEO",1100000);
	Employee e4=new Employee(104,"watson","Tester","Quality Anyalist",700000);
	Employee e5=new Employee(105,"Albert","Jr Scientist","Jr Manager",1300000);

	ArrayList<Employee>emp=new ArrayList<Employee>();
	emp.add(e1);
	emp.add(e2);
	emp.add(e3);
	emp.add(e4);
	emp.add(e5);
	
	Collections.sort(emp);
	emp.forEach(s->System.out.println(s));
	
	System.out.println("===cost");
	Collections.sort(emp, new EmployeeSalaryComparator());
	emp.forEach(s->System.out.println(s));
		
	System.out.println("===role===");
	Collections.sort(emp, new EmployeeRoleComparator());
	emp.forEach(s->System.out.println(s));
}
}