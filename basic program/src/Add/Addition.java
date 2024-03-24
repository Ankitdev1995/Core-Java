package Add;

import java.util.Scanner;

public class Addition {
	

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x,y,z;

		char command = 0;
		command=(char) sc.nextDouble();
		switch (command) {
		case add:
			System.out.println("Enter 1st number");

			x=sc.nextInt();
			System.out.println("Enter 2nd number");
			y=sc.nextInt();

			z=x+y;
			System.out.println("addition of 2 number is"+ z);
			break;

		case sub:
			System.out.println("Enter 1st number");
			x=sc.nextInt();
			System.out.println("Enter 2nd number");
			y=sc.nextInt();
			z=x*y;
			System.out.println("multiplication of 2 number is"+ z);
			break;
		default:
			break;
		}
	}


}
