package class_work_13_5;

import java.util.Scanner;

// 55555
// 44444
// 33333 
// 22222 
// 11111
public class Demo11 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value");
	int no = sc.nextInt();
	
	for(int i=5; i>=1; i--){
			
		for(int j=1; j<=5; j++){
		System.out.print(i);
	}
			System.out.println();
	}

}
}