package Thread;

public class AThread1 implements Runnable{
	public static void main(String[] args) {
		Thread AThread1=new Thread("javakiran");
		Thread AThread2=new Thread("java");
		AThread1.start();
		AThread2.start();
	System.out.println("Thread names are following:");
	System.out.println(AThread1.getName());
	System.out.println(AThread2.getName());
	
	}

	@Override
	public void run() {
		
		
	}

}
