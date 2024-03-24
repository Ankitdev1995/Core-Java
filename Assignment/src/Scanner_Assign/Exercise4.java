package Scanner_Assign;

import java.util.Scanner;

public class Exercise4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the first number");
	int num1=sc.nextInt();
	
	System.out.println("Enter the second number");
	int num2=sc.nextInt();
	
	int division=num1/num2;
	System.out.println("division is equal to :"+ division );
	
}
}
