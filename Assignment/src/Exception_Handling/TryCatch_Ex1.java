package Exception_Handling;

public class TryCatch_Ex1 {
public static void main(String[] args) {
	int num1,num2;
	try{
		num1=0;
		num2=62/num1;
		System.out.println("Try Block Message");
	}catch(ArithmeticException e){
		e.printStackTrace();
		System.out.println("Error: Don't Divide Number by Zero");
	}
		System.out.println("Try out of catch block in java");
	
	}
}
