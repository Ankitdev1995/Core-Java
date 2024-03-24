package Polymorphism;
// Method overloading by changing data type of argument
public class Area {
	
void find (int l,int b){
	System.out.println("Area is"+" "+(l*b));
}
void find (int l,int b,int h){
		System.out.println("Area is"+" "+(l*b*h));
}
}
