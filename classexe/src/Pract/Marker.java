package Pract;

public class Marker {
	
	String brand="Camlin";
	double price;
	String color;
	String type;
	
	public Marker() {
		}

	public Marker( double price, String color, String type) {
		super();
		
		this.price = price;
		this.color = color;
		this.type = type;
	}
	
public void displayMarker() {
	System.out.println(brand);
	System.out.println(price);
	System.out.println(color);
	System.out.println(type);
}
}
