package Demo3;

public class Test {
public static void main(String[] args) {
	job obj=new job();
	Thread t1=new Thread(obj);
	t1.setName("Pritam Thread:");
	
	Thread t2=new Thread (obj);
	t2.setName("Ram Thread:");
	
	Thread t3=new Thread (obj);
	t3.setName("Rashmi Thread:");
	
	t1.start();
	t2.start();
	t3.start();
	
}
}
