package Abstraction;

public  class AbstractTestExe1 extends AbstractclassExe1{

	 public void disp2(){
		System.out.println("I am Overriding abstract method");
	}
		 
	public static void main(String[] args) {
		AbstractTestExe1 obj =new AbstractTestExe1();
		obj.disp1();
		obj.disp2();
	}
}

