package Inheritance;

public class Car2 extends Vehicle2 {
	String modelType;
	
	public void showDetails(){
		modelType="sports";
		vehicleType="Car";
	
	System.out.println(modelType+" "+ vehicleType);
	}
	public static void main(String[] args) {
		Car2 c=new Car2();
		c.showDetails();
	}
}
