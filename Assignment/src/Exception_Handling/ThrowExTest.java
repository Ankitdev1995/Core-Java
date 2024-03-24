package Exception_Handling;

public class ThrowExTest {
public static void main(String[] args) {
	try{
		ThrowEx2 obj=new ThrowEx2();
		obj.mymethod(2);
	}catch(Exception ex){
		System.out.println(ex);
	}
}
}
