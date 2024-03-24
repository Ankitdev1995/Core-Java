package string_method;

public class Length_Method {
public static void main(String[] args) {
	String name="shyam";
	String email="abc@gmail.com";
	System.out.println(name.length());
	System.out.println(email.length());
	
	String name1=null;
	int i=name1.length();
	if(i==0){
		System.out.println("name is empty");
	}
	else{
		System.out.println("Valid name");
	}
	}
}

