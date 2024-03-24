package Exception_Handling;

public class ThrowEx1 {
static void throwMethod()throws NullPointerException{
	System.out.println("Inside throw method");
	throw new NullPointerException("demo");
	}
	public static void main(String[] args) {
		try{
			throwMethod();
		}catch(NullPointerException exp){
			System.out.println("The exception get caught"+ exp);
		}
		}
	}
	
