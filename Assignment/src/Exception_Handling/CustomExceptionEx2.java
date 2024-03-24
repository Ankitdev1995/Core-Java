package Exception_Handling;

public class CustomExceptionEx2 {
public static void main(String[] args) {
	try{
		throw new CustomExceptionEx1("Custom");	
	}catch(CustomExceptionEx1 exp){
		System.out.println("Hi this is my catch block");
		System.out.println(exp);
	}
}
}
