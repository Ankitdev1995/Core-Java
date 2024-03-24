package Demo;

public class JobB extends Thread{
	@Override
	public void run(){
		System.out.println("Block B");
		while(true){
			System.out.println("Hello.......");
		}
	}
	}

