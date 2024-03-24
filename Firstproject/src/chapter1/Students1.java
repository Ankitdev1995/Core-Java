package chapter1;

public class Students1 {
int regno=11;
String name="nitn";
String course="ME";
float per=56.78f;

void m1(){
	int regno=6678;
	String name="Pratibha";
	String course="ME";
	float per=67.89f;

	System.out.println("=====Local Variable=====");
	System.out.println(regno);
	System.out.println(name);
	System.out.println(course);
	System.out.println(per);
	
	System.out.println("=====Instance variable=====");
	System.out.println(this.regno);
	System.out.println(this.name);
	System.out.println(this.course);
	System.out.println(this.per);
	
}
}
