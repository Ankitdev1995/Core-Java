package string_method;

public class Trim_Method {
public static void main(String[] args) {
	String name="  ankit  manmode nagpur  ";
	System.out.println(name);
	System.out.println(name.trim());
	
	String name1="    ";
	if(name1.trim().length()==0){
		System.out.println("Name is empty");
	}
	else{
		System.out.println("valid name");
	}
	
	System.out.println("name1");
}
}
