package Exception_Handling;

public class ArrayIndexOutOfBoundEx {
public static void main(String[] args) {
	try{
		int a[]=new int[10];
		a[11]=9;
	}catch(ArrayIndexOutOfBoundsException e){
	e.printStackTrace();
		System.out.println("ArrayIndexOutOfBounds");
	}
}
}
