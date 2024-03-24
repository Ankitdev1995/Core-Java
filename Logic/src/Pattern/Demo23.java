package Pattern;

import java.util.Scanner;

//to print factorial of a numbers
public class Demo23 {
	public static void main(String[] args) {
	
		int i,sum=1;
		int m =5;
		for(i=1; i<=m; i=i+1)
		{
		sum=sum*i;
		}
		System.out.println(sum);
		
	///
		System.out.println("=============");
		
		int num=6;
		long factorial =1;
		for (int j=1; j<=num; j++)
		{
			// factorial =factorial *1;
			factorial*=j;
			System.out.println(factorial); 
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter an number");
		int i, sum=1;
		
		int p=sc.nextInt();
		for(i=1;i<=p;i++){
			sum=sum*i;
			System.out.println(sum); */
		}
		}
}