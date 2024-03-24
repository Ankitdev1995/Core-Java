package scanner;

import java.util.Scanner;

public class Room_prac7 {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		
		switch(age){
		case 18:
			System.out.println("You are going to become an adult");
		break;

		case 24:
			System.out.println("You are going to join a company");
		break;
		
		case 30:
			System.out.println("You are going to get marry");
		break;
		
		case 60:
			System.out.println("You are going to get retired");
		break;
		
		default: 
			System.out.println("Enjoy your life");
			}
		System.out.println("Thanks for using my JAVA code");
}
}
