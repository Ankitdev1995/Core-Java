package Multi_thread2;

public class Test {
public static void main(String[] args) {
	Job obj=new Job();
	
	Thread t1=new Thread(obj);
	t1.setName("VLC Thread: ");
	
	Thread t2=new Thread(obj);
	t2.setName("Media Player Thread: ");
	
	Thread t3=new Thread(obj);
	t3.setName("Montu Thread: ");
	
	t1.start();
	t2.start();
	t3.start();
	
}
}
