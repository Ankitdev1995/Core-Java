package Exception_Handling;

public class CustomExceptionEx3 {
public static void main(String[] args) throws Exception{
	CustomExceptionEx3 es=new CustomExceptionEx3();
	es.displayMymsg();
	}
	public void displayMymsg()throws CustomExceptionEx1{
		for(int j=8;j>0;j--){
			System.out.println("j="+j);
			if(j==7){
				throw new CustomExceptionEx1("This is my Own Custom message");
			}
		}
	}
}
