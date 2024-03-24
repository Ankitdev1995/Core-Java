package Class_Demo1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Test {
public static void main(String[] args) throws IOException {
	Employee e1=new Employee(40,"Sam","Data Scientist",600000.7f);
	Employee e2=new Employee(41,"Jhon","Quality Anyalist",500000.45f);
	Employee e3=new Employee(42,"Sean","Team Leader",650000.87f);
	
	Product p1=new Product(50,"Sugar","Grocery",60.7f);
	Product p2=new Product(51,"Salt","Grocery",30.47f);
	Product p3=new Product(52,"Soap","Grocery",100.74f);
	
	Student s1=new Student(53,"Ankit","JAVA",90.98f);
	Student s2=new Student(54,"Sachin","Selenium",60.45f);
	Student s3=new Student(55,"vinay","Python",78.7f);
	
	ArrayList<Employee>emplist=new ArrayList<Employee>();
	emplist.add(e1);
	emplist.add(e2);
	emplist.add(e3);
	
	FileOutputStream fos =new FileOutputStream("Targeted1234.txt");
	ObjectOutputStream oos =new ObjectOutputStream(fos);
	oos.writeObject(emplist);
	oos.close();
	fos.close();
	
	ArrayList<Product>prodlist=new ArrayList<Product>();
	prodlist.add(p1);
	prodlist.add(p2);
	prodlist.add(p3);
	
	FileOutputStream fos1 =new FileOutputStream("Targeted12.txt");
	ObjectOutputStream oos1 =new ObjectOutputStream(fos1);
	oos1.writeObject(prodlist);
	oos1.close();
	fos1.close();     
	
	ArrayList<Student>studlist=new ArrayList<Student>();
	studlist.add(s1);
	studlist.add(s2);
	studlist.add(s3);
	
	FileOutputStream fos2 =new FileOutputStream("Targeted12.txt");
	ObjectOutputStream oos2 =new ObjectOutputStream(fos2);
	oos2.writeObject(studlist);
	oos2.close();
	fos2.close();

	
	N obj=new N();
	obj.display(studlist);
	obj.display(prodlist);
	obj.display(emplist);
	
}
}
