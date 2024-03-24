package WithoutSync;

public class Test {
public static void main(String[] args) throws InterruptedException {
	Job obj=new Job();
	
	Thread t1=new Thread(obj);
	t1.setName("t1");
	
	Thread t2=new Thread(obj);
	t2.setName("t2");
	
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	
	System.out.println(obj.a);
}
}
