package Excep_Hnd;

import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try{
		 int arr[]={56,676,7673,4354};
		 int index =sc.nextInt();
		 System.out.println(arr[index]);
		 
		 String s="Hello";
		 index=sc.nextInt();
		 System.out.println(s.charAt(index));
	
		 int a=10;
		 int b=sc.nextInt();
		 int r=a/b;
		 System.out.println(r);
		 
	}catch(ArrayIndexOutOfBoundsException |StringIndexOutOfBoundsException | ArithmeticException e){
		e.printStackTrace();
	}
	System.out.println("Bye Bye");
	
	}
}
