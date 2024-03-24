package Abstraction;


public class InterfacetestEx1 implements Interface11,Interface22 {
		
	public void myMethod(){
		System.out.println("multiple inheritence example using interface");
	}	
	public static void main(String[] args) {
		InterfacetestEx1 obj=new InterfacetestEx1();
		obj.myMethod();
	}
}
