package Polymorphism;

public class Override {
public static void main(String[] args) {
	
	DerivedClass der=new DerivedClass();
	der.method();
	
	Baseclass base=new Baseclass();
	base.method();
	
	Baseclass base1=new DerivedClass();
	base1.method();
		
	Baseclass base2=new DerivedClass();
	System.out.println(base2.a);
}
}
