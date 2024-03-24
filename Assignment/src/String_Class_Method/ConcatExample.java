package String_Class_Method;

public class ConcatExample {
public static void main(String[] args) {
	String s1="java string";
	s1.concat("is Immutable");
	System.out.println(s1);
	s1=s1.concat(" "+"is immutable so assign it explicitly");
			System.out.println(s1);


	String s3="Raja";
	String s4="Ram";
	System.out.println(s3+" "+s4);

	String s6="Rajkumar";
	String s7="rajendra";
	System.out.println(s6.concat(s7));
}
}
