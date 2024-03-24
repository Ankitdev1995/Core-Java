package scanner;

import java.util.Scanner;

public class Room_prac1 {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	
			System.out.println("Enter name");
			String name=s.next();
			
			System.out.println("Enter Gender");
			char Gender=s.next().charAt(0);
			
			System.out.println("Enter age");
			int age=s.nextInt();
			
			System.out.println("Enter phone number");
			long phone=s.nextLong();
			
			System.out.println("==================");
			
			System.out.println("Enter  name:"+ name);
			System.out.println("Enter  Gender:"+ Gender);
			System.out.println("Enter  age:"+ age);
			System.out.println("Enter  phone number:"+ phone );
}
}