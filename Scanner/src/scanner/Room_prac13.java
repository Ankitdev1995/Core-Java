package scanner;

import java.util.Scanner;
///// by using if else
public class Room_prac13 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int Button=sc.nextInt();
	
		if(Button==1){
			System.out.println("hello");
			
		}else if(Button==2){
			System.out.println("Namste");
			
		}else if(Button==3){
			System.out.println("Bonjour");
			
		}else{
			System.out.println("Invalid");
		}
	

///// by using switch case
		switch(Button){
		case 4:System.out.println("hello");
		break;
		case 5:System.out.println("Namaste");
		break ;
		case 6: System.out.println("Bonjour");
		break ;
		default:
		System.out.println("Invalid Button");
		}
}
}