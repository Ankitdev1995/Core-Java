package Abstraction;

public class AbstractSubclassEx2 extends AbstractclassEx2{
	int x,y,z;
	void get(int a,int b){
		x=a;
		y=b;
	}
	void add(){
		 z=x+y;
		 }
	 void display(){
		System.out.println("The addition is:"+z);
	}
}
