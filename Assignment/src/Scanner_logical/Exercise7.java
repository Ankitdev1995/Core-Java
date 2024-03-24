package Scanner_logical;

import java.util.Scanner;

public class Exercise7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length of rectangle");
	double length =sc.nextDouble();
	System.out.println("Enter breadth of rectangle");
	double breadth=sc.nextDouble();
	double area=length*breadth;
	System.out.println("Area of rectangle is:" + area);
}
}
