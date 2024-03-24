package DeepakSir;

public class PRIORITY extends Thread{

	public void run(){
		System.out.println("child thread");
	
	System.out.println("Child Thread Priority=>"+Thread.currentThread().getPriority());
	}
	}

