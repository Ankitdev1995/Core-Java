package class_work_12_5;

import java.util.Scanner;

/*	input 	4179
  
	output 	900
		 	700
   	 		100
      		400 	*/

public class Demo12 {
	public static void main(String[] args) {
		
	int n= 4179;
	for(; n>0; n=n/10){
	int r=n%10;
	System.out.println(r*100);
	
}
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number");
	int r;
	int no = sc.nextInt();
	while(no>0) {
		r=no%10;
		no=no/10;
	System.out.println(r);
	System.out.println(r*100);
}
}
}