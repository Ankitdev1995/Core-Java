package Excep_Hnd;

public class TestM {
public static void main(String[] args){
	//	throws ClassNotFoundException{
	//Class.forName("Excep_Hnd.M");//write N instead of M
	
	try{
	Class.forName("Excep_Hnd.N");
	}
	catch(ClassNotFoundException e){
		e.printStackTrace();
		System.out.println("Handle class not found exception");
	}
	System.out.println("Bye Bye");
}
}
