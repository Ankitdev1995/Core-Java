package book;

public class Order {
int orderid;
String orderdate;
void calBill(Book x,Book y,Book z ){
	float result = x.price+y.price+z.price;
	System.out.println("Total Bill " + result);
	
}
}
