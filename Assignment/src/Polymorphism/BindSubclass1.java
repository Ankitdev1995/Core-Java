package Polymorphism;

public class BindSubclass1 extends BindExe1{
	void display(){
		super.display();
		
	String text="SubClass1's";
	System.out.println(text+ "function called");
}
}