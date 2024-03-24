package Array_exe;

import java.util.Scanner;

public class Exe4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[] = new int[5];
	
	System.out.println("Enter Array Element:");
	for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<a.length;i++){	
	System.out.println(a[i]);
	}	
}
}

