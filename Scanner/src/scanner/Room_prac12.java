package scanner;

import java.util.Scanner;

public class Room_prac12 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	if (a==b){
		System.out.println("Equal");
		}
	else if(a>b){
		System.out.println("A is greater");
		}
	else{
		System.out.println("A is lesser");
		}
}
}
