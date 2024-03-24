package class_work_12_5;

import java.util.Scanner;

// input- 4179

public class Demo10 {
	public static void main(String[] args) {

		int no=4179;
		int r; 
		for(no=4179; no>0; no=no/10){
			r=no%10; 
			System.out.println(r); 
		}
		System.out.println();


		////
		System.out.println("=============");

		int n=12345;
		int rem,sum=0;
		while (n>0){
			rem=n%10;
			n=n/10;
			sum=(sum*10)+rem;
		}
		System.out.print(sum);
	System.out.println("***********");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number");
	int number = sc.nextInt();
	int re, summ=0;
	while(number>0) {
		re = number%10;
		number = number/10;
		summ = (summ*10)+re;
		}
		System.out.println(summ);
	}
}
