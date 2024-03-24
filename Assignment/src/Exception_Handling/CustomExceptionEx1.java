package Exception_Handling;

public class CustomExceptionEx1 extends Exception {
		
	String str1;
	CustomExceptionEx1(String str2){
		str1=str2;
	}
	public String toString(){
		return("Output String="+str1);
		
	}
}
