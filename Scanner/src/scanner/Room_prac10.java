package scanner;

import java.util.Scanner;

public class Room_prac10 {
public static void main(String[] args) {
	System.out.println("Enter your age");	
	Scanner obj=new Scanner(System.in);
	int age=obj.nextInt();
	
	if(age>18&&age<50){
		System.out.println("adult");
		}
	else if (age<15){
		System.out.println("Not an Adult");
		
		}
	else{
		System.out.println("Senior Citizen");
		}
	}
}
