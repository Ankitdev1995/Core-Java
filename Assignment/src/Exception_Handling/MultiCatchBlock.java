package Exception_Handling;

public class MultiCatchBlock {
public static void main(String[] args) {
	try{
		int a[]=new int[7];
		a[4]=30/0;
		System.out.println("First print statement in try block");
	}catch(ArithmeticException e){
		e.printStackTrace();
		System.out.println("Warning:Arithmetic Exception");
	}catch(ArrayIndexOutOfBoundsException e){
		e.printStackTrace();
		System.out.println("Warning:Array index out of bound Exception");
	}catch(Exception e){
		e.printStackTrace();
		System.out.println("Warning : some other exception");
	}
		System.out.println("Out of try Catch block");
	}
}

