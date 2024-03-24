package string_method;

public class REmove_space {
public static void main(String[] args) {
	String st="hello everyone all good";
	System.out.println("old sentence => " +st);
	
	st = st.replaceAll( "\\s", " ");
	System.out.println(" After replacement => "+st);
}
}
