package string_method;

public class Exe3 {
public static void main(String[] args) {
	String s1="played ";
	String s2="PlAyeD";
	
	boolean b=s1.equals(s2);
	System.out.println(b);

	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.equals(" ")); //String is empty or not
}
}
