package class_work_12_5;

import java.util.Scanner;

// input- 12345

public class Demo11 {
public static void main(String[] args) {
	
	int t=12345 ;
	for(int no=t; no>0; no=no/10){
	int r=no%10;
	for(int j=1; j<=r; j=j+1){
		System.out.print(r);
	}
    System.out.println();
}
	System.out.println("************");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number");
	int num = sc.nextInt();
	for(int i=num; num>0; num=num/10) {
		int r = num%10;
		for(int j=1;j<=r;j=j+1) {
			System.out.print(r);
		}
		System.out.println();
	}
}
}