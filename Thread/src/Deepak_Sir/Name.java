package Deepak_Sir;

public class Name extends Thread{
	@Override
	public void run() {
		System.out.println("Thread task is executed by :"+Thread.currentThread().getName());
	}

}
