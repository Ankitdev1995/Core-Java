package Class_work;

public class Pract {
public static void main(String[] args) {
	String s1 ="Ankit";
	String s2 ="Ankit";
	
	String s3 = new String("Ankit");

	String s4 = new String("Ankit");
	
	System.out.println(s1==s2); // true
	System.out.println(s2==s3);
	System.out.println(s3==s4);
}
}
