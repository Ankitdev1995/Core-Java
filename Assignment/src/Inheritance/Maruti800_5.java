package Inheritance;


public class Maruti800_5 extends Maruti5{
	public Maruti800_5(){
		System.out.println("Constructor of class Maruti800");
	}
	public void speed(){
		System.out.println("Max speed:80Kmph");
	
	}
	public static void main(String[] args) {
	Maruti800_5 obj=new Maruti800_5();
	
	obj.vehicleType();
	obj.brand();
	obj.speed();	
	}
}
	
	

	