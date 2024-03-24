package Access_Modifier;

public class AccessDemo2 {
private int x=56;
public void showDemo(){
	System.out.println("The Variable value is"+ x);
}
private void testDemo(){
	System.out.println("It can not be accessed in another class");
}

}
