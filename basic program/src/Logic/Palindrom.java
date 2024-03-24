package Logic;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
	int n=12387321;
	int r,sum=0;
	int t=n;
	while(n>0){
		r=n%10;
		n=n/10;
		sum=(sum*10)+r;
	}
		if(t==sum)
			System.out.println(t+" is palindrom");
		else
		System.out.println(t+" is not  palindrom");	

	/* By using scanner class

		Scanner sc=new Scanner(System.in);
		int r,sum=0;
		System.out.println("Enter an number");
		int n=sc.nextInt();
		while(n>0){
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
			System.out.println(sum); */
		}	
	}




