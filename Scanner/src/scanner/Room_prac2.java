package scanner;

import java.util.Scanner;

public class Room_prac2 {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
		
			System.out.println("Enter Your name");
			String name=s.next();
			
			System.out.println("Enter the age");
			byte age =s.nextByte();
			
			System.out.println("Enter marks in three subject");
			int m1=s.nextInt();
			int m2=s.nextInt();
			int m3=s.nextInt();
			int total=m1+m2+m3;
			double Average= total/3.0;
			
			System.out.println("total, Average, name= " + total +" "+  Average +" "+ name);
			
}	 
}
