package Scanner_logical;
//Write a Java program to calculate area and circumference of circle
import java.util.Scanner;

public class Exercise8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the radius");
	double radius=sc.nextDouble();
	
	double area=Math.PI*(radius*radius);
			
	System.out.println("The area of circle is:" + area); 
	double circumference = Math.PI*2*radius;
	System.out.println("The circumference of circle is:"+ circumference);
}
}
