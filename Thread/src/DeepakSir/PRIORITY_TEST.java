package DeepakSir;


public class PRIORITY_TEST extends Thread{
public static void main(String[] args) {
	System.out.println("main Thread old Priority =>" +Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(MAX_PRIORITY);
	System.out.println("main Thread new Priority =>"+Thread.currentThread().getPriority());
	PRIORITY t=new PRIORITY();
	t.setPriority(6);
	t.start();
}
}
