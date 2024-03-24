package Class_Demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {
public static void main(String[] args) throws IOException {
	Student s1=new Student(11,"Raju","BE",8.7f);
	Student s2=new Student(12,"Ram","ME",7.7f);
	Student s3=new Student(13,"Rajesh","Phd",9.7f);
	
	Employee e1=new Employee(21,"priti","Developer",970000);
	Employee e2=new Employee(22,"prachi","tester",700000);
	Employee e3=new Employee(23,"pranay","QA",900000);

	Product p1=new Product(31,"pen","Stationary",90f);
	Product p2=new Product(32,"pencil","Stationary",30f);
	Product p3=new Product(33,"Erasor","Stationary",15f);
		
	ArrayList<Student>studlist= new ArrayList<Student>();
	studlist.add(s1);
	studlist.add(s2);
	studlist.add(s3);
	
	
	
	ArrayList<Employee>emplist=new ArrayList<Employee>();
	emplist.add(e1);
	emplist.add(e2);
	emplist.add(e3);

	
	ArrayList<Product>prodlist=new ArrayList<Product>();
	prodlist.add(p1);
	prodlist.add(p2);
	prodlist.add(p3);
	
	
	M obj=new M();
	obj.displayStudent(studlist);
	obj.displayEmp(emplist);
	obj.displayProd(prodlist);
	
}
	
}
