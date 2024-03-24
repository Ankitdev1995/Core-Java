package String_Class_Method;

public class IndexOfExample {
public static void main(String[] args) {
	String s1="This is index of example";
	
	int index1=s1.indexOf("This");
	System.out.println(index1);

	int index2=s1.indexOf("dex");
	System.out.println(index2);
	
	int index3=s1.indexOf("of");
	System.out.println(index3);
	
	int index4=s1.indexOf('n');
	System.out.println(index4);

	int index5=s1.indexOf(" ");
	System.out.println(index5);
}
}
