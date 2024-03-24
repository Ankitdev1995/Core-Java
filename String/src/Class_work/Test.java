package Class_work;

public class Test {
public static void main(String[] args) {
	String s1="Hello";
	String s2="Hello";
		
	if(s1==s2)
		System.out.println("s1 and s2 are equal");
	else
		System.out.println("s1 and s2 are not equal");
	
	System.out.println("=====(Address)reference is compair================");

	String s3=new String("Hello");
	String s4=new String("Hello");
		
	
	if(s3==s4)
		System.out.println("s3 and s4 are equal");
	else
		System.out.println("s3 and s4 are not equal");

	System.out.println("====(String)content is compair===============");
	if(s3.equals(s4))
		System.out.println("s3 and s4 are equal");
	else
		System.out.println("s3 and s4 are not equal");



}
}
