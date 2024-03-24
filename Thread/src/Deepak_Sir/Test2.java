package Deepak_Sir;

public class Test2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Task 2");
	}
	public static void main(String[] args) {
		Test2 t=new Test2();
		Thread Th=new Thread(t);
		Th.start();
	}
		
	}
	
