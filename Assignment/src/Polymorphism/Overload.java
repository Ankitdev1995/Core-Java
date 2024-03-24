package Polymorphism;
// Simple Method Overloading example
public class Overload {

	void demo (int a){
		System.out.println("a==>"+" "+ a);
	}
	void demo(int a,int b){
		System.out.println("a and b==>"+a+","+b);
	}
	double demo(double a){
		System.out.println("double a==>"+a);
		double r=a*a;
		return r;
	}
	int demo(int a,int b,int c){
			int r=a+b+c;
			return r;
		}
	}
