package Inheritance;

public class Test3 {
public static void main(String[] args) {
	Car3 b1=new Car3();
	
	b1.color="red";
	b1.setSpeed(200);
	b1.setSize(22);
	b1.setCc(1000);
	b1.gears=5;
	
	System.out.println("Color of car :"+b1.color);
	System.out.println("Speed of car is :"+b1.getSpeed());
	System.out.println("size of car is:"+b1.getSize());
	System.out.println("CC of car is :"+b1.getCc());
	System.out.println("gears in car is:"+b1.gears);
	
}
}