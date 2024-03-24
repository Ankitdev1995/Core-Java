package super_this;

public class Constructor_2 {
	
public Constructor_2()
	{
	System.out.println("Constructor Running");
	}
 	public Constructor_2 (int a)
 	{
 		System.out.println("Constructor Running" +" "+ 5);
 	}
 	public static void main(String[] args) {
	Constructor_2 cd=new Constructor_2();
	Constructor_2 cd1=new Constructor_2(67);
}
 
}