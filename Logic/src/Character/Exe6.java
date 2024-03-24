package Character;

public class Exe6 {
public static void main(String[] args) {
	String s="Hello";
	int n=s.length()-1;
	for(int i=n;i>=0;i--)
		System.out.println(s.charAt(i)); 

	System.out.println("============");   

	String p="Ankit";
	for(int i=p.length()-1;i>=0;i--)
		System.out.println(p.charAt(i));
	
	System.out.println("============");
	
	String k="Nagpur";
	for(int i=5;i>=0;i--)
		System.out.println(k.charAt(i));
	System.out.println("********");
	
	String g = "PUNA";
	int d = g.length()-1;
	for(int i=d;i>=0;i--) {
		System.out.println(g.charAt(i));
	}
}
}
