package String_logical;

public class ReverseString {
public static void main(String[] args) {
	String s="java by kiran";
	char a[]=new char[s.length()];
	int n=s.length()-1;
	for(int i=0;i<s.length();i++){
		a[i]=s.charAt(n);
		n--;
	}	
	String rev=new String(a);
	System.out.println(rev);
}
}
