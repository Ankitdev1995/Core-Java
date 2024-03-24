package String_logical;

import java.util.Scanner;

public class ScannerExe1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your rollno");
	int rollno=sc.nextInt();
	System.out.println("Enter your name");
	String name=sc.next();
	System.out.println("Enter your fee");
	double fee=sc.nextDouble();
	
	System.out.println("Roll no:"+rollno+" "+"\nName:"+name+" "+"\nfee:"+fee );
}
}
