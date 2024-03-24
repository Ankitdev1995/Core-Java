package Abstraction;

public  class AbstractSubclassEx4 extends AbstractEx4{
	String name;
	
	void getVal(String name){
		this.name=name;
	}
	void display(){
		System.out.println("Hello"+" "+name );
	}
}
