package Character;

import java.util.Scanner;
//  
public class Exe1 {
	public static void main(String[] args) {

		int no = 45789;

		while(no>0){

			int r = no%10;
			no = no/10;
			
			System.out.println(r);
		}
		System.out.println("***************");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		
		int num = sc.nextInt();
		
		while(num>0) {
			int r = num%10;
			num = num/10;
			System.out.print(r);
		}
	}
}