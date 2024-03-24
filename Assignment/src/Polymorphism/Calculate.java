 package Polymorphism;
//Method overloading by changing data type of Argument
public class Calculate {
	void sum(int d,int e){
		System.out.println("sum is"+" "+(d+e));
	}
	void sum(double a,double b){
		System.out.println("sum is"+" "+(a+b));
	}
	
public static void main(String[] args) {
	Calculate cal=new Calculate();
	cal.sum(8, 5);
	cal.sum(4.6, 3.8);
}
}
