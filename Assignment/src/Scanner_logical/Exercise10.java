package Scanner_logical;

import java.util.Scanner;

public class Exercise10 {
public static void main(String[] args) {
	System.out.println("Enter side of square:");
	Scanner sc=new Scanner(System.in);
	double side=sc.nextDouble();
	double area=side*side;
	System.out.println("Area of square is:"+ area);
	
}
}
