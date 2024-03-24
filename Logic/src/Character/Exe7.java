package Character;

public class Exe7 {
public static void main(String[] args) {
	String s="HELLO";	
	
	for(int i=0;i<s.length();i++){
		for(int j=1;j<=6;j++){
	System.out.print(s.charAt(i));
			}
		System.out.println();
}
	
	System.out.println("***************");
	String p ="ELEPHANT" ;
	
	for(int i=0;i<=p.length();i++) {
		for(int j=1;j<=7;j++) {
			System.out.print(p.charAt(i));	
		}
		System.out.println();
	}
}
}