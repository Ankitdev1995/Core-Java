package ITEM;

public class Test {
	public static void main(String[] args) {
		Product p1=new Product(111,"pen",10,100);
		Product p2=new Product(112,"pencil",20,150);
		Product p3=new Product(113,"Erasor",30,104);
		Product p4=new Product(114,"stapler",50,103);
		Product p5=new Product(115,"notebook",200,150);
		Product p6=new Product(116,"marker",10,104);
		Product p7=new Product(117,"chair",400,10);
		
		
		Order o1=new Order(119,"15 may",p7,p4,p5);
		Bill bill= new Bill(2344);
		
		bill.CalBill(o1);
		System.out.println("after discount amount is:" +bill.Final_price);
	}
}
