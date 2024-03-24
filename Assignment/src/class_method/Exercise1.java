package class_method;

public class Exercise1 { 
	int a;
	float b;
	String str;
	public void operation1(){
		a=10;
		b=15.25f;
		str="java";
	}
	public void operation2(){
		a=20;
		b=27.0f;
		str="SELENIUM";
		}
public void display(){
		System.out.println("============");
		System.out.println("The interger value is:"+a);
		System.out.println("The float value is:"+b);
		System.out.println("The String value is:"+str);
}
}