package Excep_Hnd;
public class Demo2 {
public static void main(String[] args) {
	try{
		int a=10;
		int b=0;
		int r=a/b;
		System.out.println(r);
	}catch(ArithmeticException e){
		 e.printStackTrace();
		System.out.println("Exception Handle");
	}	
}
}
