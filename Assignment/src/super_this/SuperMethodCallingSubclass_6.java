package super_this;

public class SuperMethodCallingSubclass_6 extends SuperMethodCalling_6{
	void display(){
		System.out.println("Child class method");
	}
	void printMsg(){
		
		display();
		super.display();
	}
	public static void main(String[] args) {
		SuperMethodCallingSubclass_6 obj=new SuperMethodCallingSubclass_6();
		obj.printMsg();
	}
}


