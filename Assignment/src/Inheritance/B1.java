package Inheritance;

public class B1 extends A1 {
	
public void methodB1(){
	System.out.println("child class method");
	}

public static void main(String[] args) {
	B1 obj=new B1();

	obj.methodA1();
	obj.methodB1();
}
}
