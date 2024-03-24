package string_method;
// Compare the string
public class Exe16 {
public static void main(String[] args) {
	String name1="Ankit";
	String name2="Ankit2";
	/*  s1>s2: +ve value
	    s1==s2: 0
	    s1<s2: -ve value      */
	if(name1.compareTo(name2)==0){
		System.out.println("String are equal");
	}
	else{
		System.out.println("String are not equal");
	}
}
}
