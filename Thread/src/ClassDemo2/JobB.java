package ClassDemo2;

public class JobB extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=100;i++)
			System.out.println("Hello");
		
		}
	}

