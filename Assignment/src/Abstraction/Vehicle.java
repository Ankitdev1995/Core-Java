package Abstraction;

public class Vehicle implements Moveable{
	public void move(){
		System.out.println("Average speed is==>"+" "+AVG_SPEED);
		
	}
	
	public static void main(String[] args) {
		Vehicle obj=new Vehicle();
		obj.move();
	}
}
