package scanner;

import java.util.Scanner;

public class Room_prac8 {
	public static void main(String[] args) {
		System.out.println("Taking input from the user");
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number 1");
		int a= sc.nextInt();
		System.out.println("Enter number 2");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("The sum of these number is");
		System.out.println(sum);
		
		String sr=sc.nextLine();
		System.out.println(sr);
	}
}
