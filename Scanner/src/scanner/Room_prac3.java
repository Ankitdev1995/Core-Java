package scanner;

import java.util.Scanner;

public class Room_prac3 {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int cost=480;
	
	System.out.println("Enter a number of shirts");
	int no_of_shirt=s.nextInt();
	double Discount = cost*12.5/100.0;
	double  New_price =cost- Discount;
	double Payable_amount= New_price*no_of_shirt;
	System.out.println("Payable_amount="+ Payable_amount);
	}	
}
