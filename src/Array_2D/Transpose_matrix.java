package Array_2D;

import java.util.Scanner;

public class Transpose_matrix {
public static void main(String[] args) {
	int a[][]=new int[2][2];
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Array Data:\n");
	for(int i=0;i<2;i++){
	for(int j=0;j<2;j++){
		a[i][j]=sc.nextInt();
	}
	}
	System.out.print("Array Matrix:\n");
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			System.out.print(a[i][j]+" ");
		}
	System.out.print("\n");}

	System.out.print("Transpose of Matrix:\n");
 	for(int i=0;i<2;i++){
	 for(int j=0;j<2;j++){
		 System.out.print(a[j][i]+" ");
	 }
 System.out.print("\n");
}
}
}