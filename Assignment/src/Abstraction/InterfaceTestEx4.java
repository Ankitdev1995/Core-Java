package Abstraction;

public class InterfaceTestEx4 implements InterfaceEx4{
	
	public void method1(){
		System.out.println("implemented method1");
	}
	public void method2(){
		System.out.println("implemented method2");
	}

	public static void main(String[] args) {
		InterfaceEx4 obj=new InterfaceTestEx4();
		obj.method1();
		obj.method2();
	}
	}


