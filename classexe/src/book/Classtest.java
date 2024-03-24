package book;

public class Classtest {

	public static void main(String[] args) {
		Book B1=new Book();
		Book B2=new Book();
		Book B3=new Book(); 
		
		B1.id=234; B1.bookname="History"; B1.price=1001.72f;
		B2.id=234; B2.bookname="Geography"; B2.price=1091.72f;
		B3.id=234; B3.bookname="Maths"; B3.price=1405.72f; 
		
		Order o1 = new Order();
		o1.orderid=100;
		o1.calBill(B1,B2,B3);
}
}