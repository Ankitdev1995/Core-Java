package Final_Static;

public class FinalVarMethod {
final int a=10;
final void JBK(){
	final int i=0;
	for(i=0;i<5;i++){
		System.out.println("value of I:"+ i);
		
	}
}
	public static void main(String[] args) {
		FinalVarMethod finalEx=new FinalVarMethod();
		finalEx.JBK();
	}

}
