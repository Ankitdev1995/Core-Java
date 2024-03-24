package Class_Demo;

import java.util.ArrayList;

public class M {
	void displayEmp(ArrayList<Employee>list){
		System.out.println("========");
		list.forEach(s->System.out.println(s));
	}
	void displayProd(ArrayList<Product>list){
		System.out.println("========");
		list.forEach(s->System.out.println(s));
	}
	void displayStudent(ArrayList<Student>list){
		System.out.println("========");
		list.forEach(s->System.out.println(s));
	}
}