package Abstraction;

public class InterfaceTestEx2 implements InterfaceEx22,InterfaceEx21{
	public void method1(){
		System.out.println("Implemented method1");
		}
	public void method2(){
		System.out.println("Implemented method2");
	}
		
	
		public static void main(String[] args) {
			InterfaceTestEx2 obj=new InterfaceTestEx2();
			obj.method1();
			obj.method2();
		}
	}
