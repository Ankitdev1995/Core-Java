package Inheritance;

public class Z4 extends Y4{
	public void methodZ4(){
		System.out.println("class Z method");

	}
	public static void main(String[] args) {
		Z4 obj=new Z4();

		obj.methodX4();
		obj.methodY4();
		obj.methodZ4();

	}
}
