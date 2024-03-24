package scanner;

import java.util.Scanner;

public class Room_prac6 {
	public static void main(String[] args) {
		
		 int age;
		System.out.println("Enter your age");
		Scanner sc = new Scanner (System.in);
		age=sc.nextInt();
		if(age>56){
		System.out.println("You are Experienced");
		}
		else if (age>46){
			System.out.println("You are semi Experienced");
			}
		else if(age>36){
			System.out.println("You are semi semi Experienced");
		}
		else{
		System.out.println("You are not Experienced");
		}
		
		
	}
}