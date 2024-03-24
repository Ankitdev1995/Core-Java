package Exception_Handling;

public class ThrowEx3 {
	static void checkEligibility (int stuage, int stuweight){
		if(stuage<12&&stuweight<40){
			throw new ArithmeticException("Students is not eligible for registration");
		}else{
			System.out.println("Entries Valid!!");
			
		}
	}
		 
	public static void main(String[] args) {
		System.out.println("Welocome to Registration process!!");
		checkEligibility(10,39);
		System.out.println("Have a nice day");
	}
}
