package Exception_Handling;

public class ExceptionEx1 {
public static void main(String[] args) {
	int []array={1,2};
	try{
		System.out.println("The 10th value of array is:"+array[10]);
	}catch(Exception e){
		e.printStackTrace();
		System.out.println("The error:"+e);
	}
	
}
}
