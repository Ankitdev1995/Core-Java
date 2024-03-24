package Book_Ex;

public class lab1 {
public static void main(String[] args) {
	System.out.println("Main Begin");
	
	Thread t=Thread.currentThread();
	System.out.println(t);
	
	System.out.println(t.getName());
	t.setName("JAVABYKIRAN");
	
	System.out.println(t.getPriority());
	t.setPriority(9);
	
	System.out.println(t);
	
	System.out.println("main end");
}
}
