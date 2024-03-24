package Logic;

public class Reverse {
public static void main(String[] args) {
	int n=12345,sum=0;
	String c="pune";
	String A,E,I,O,U = null ;
	String s="dkjlkAUAUIhjkOE";
	
	
	System.out.println(c.toUpperCase());
	int r;
	while(n>0){
		r=n%10;
		n=n/10;
		sum=(sum*10)+r;
		}
		System.out.println(sum);
}
}
