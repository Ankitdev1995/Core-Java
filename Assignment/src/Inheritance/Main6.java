package Inheritance;

public class Main6 {
public static void main(String[] args) {
	Employee6 e1=new Employee6();
	
	e1.name="pp";
	e1.age=89;
	e1.ph=766544333;
	
	e1.name="Ankit";
	e1.age=22;
	e1.ph=123456789l;
	e1.specialization="Java";
	

	Manager6 m1=new Manager6();
	m1.name="Python";
	m1.age=25;
	m1.ph=378463746l;
	m1.department="HR";
	
	
	System.out.println(e1.name);
	System.out.println(e1.age);
	System.out.println(e1.ph);
	//System.out.println(e1.specialization);
	System.out.println("=====================");
	
	System.out.println(m1.name);
	System.out.println(m1.age);
	System.out.println(m1.ph);
	System.out.println(m1.department);
}
}
