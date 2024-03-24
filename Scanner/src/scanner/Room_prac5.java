package scanner;

import java.util.Scanner;

public class Room_prac5 {
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total marks: ");
		int total=s.nextInt();
		
		System.out.println("Enter marks in five subject");
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		int m4=s.nextInt();
		int m5=s.nextInt();
		
		int marks_obt =m1+m2+m3+m4+m5;
		float per= ((float)marks_obt/total )*100;
		
		System.out.println("marks_obt"+" "+marks_obt+" " +"per"+" "+ per);
	}
}