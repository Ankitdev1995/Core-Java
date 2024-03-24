package Exception_Handling;

public class StringIndexOutOfBoundIndex {
public static void main(String[] args) {
	try{
		String str="easy steps to build website";
		System.out.println(str.length());
		
		char c=str.charAt(0);
		c=str.charAt(40);
		System.out.println(c);
		
	 }catch(StringIndexOutOfBoundsException e){
		System.out.println("StringIndexOutOfBoundsException");
		}
	}
	}
