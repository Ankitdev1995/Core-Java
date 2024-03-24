package Polymorphism;

public class Student_Test {
public static void main(String[] args) {
	Student s1=new Student();
	s1.setData("Shanti",20);
	
	Student s2=new Student();
	s2.setData("Veera",25,"veera@candidijava.com");
	s1.display();
	s2.display();
}
}
