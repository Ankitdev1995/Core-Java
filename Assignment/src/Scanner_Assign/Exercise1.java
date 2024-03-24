package Scanner_Assign;
// The program for taking input from 
// user then calculates the sum and 
// display output on screen
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		int num1,num2,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		num1=sc.nextInt();
		System.out.println("Enter Second Number");
		num2=sc.nextInt();
		sc.close(); 
		sum=num1+num2;
		System.out.println("Sum of the numbers:" + sum );
	}

}
 