package ITEM;

public class Bill {
int bill_no;
float Total_amount;
float discount;
float Final_price;
Bill(int bill_no){
	this.bill_no=bill_no;
}
	void CalBill(Order o1){
		
	Total_amount = o1.P1.cost +o1.P2.cost +o1.P3.cost ;
	System.out.println(Total_amount);
	discount =(Total_amount*10)/100;
	System.out.println("Applied discount 10%");
	
	Final_price=Total_amount-discount;
	System.out.println(Final_price);
}
}