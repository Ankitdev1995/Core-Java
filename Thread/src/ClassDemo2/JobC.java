package ClassDemo2;

public class JobC extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=100;i++)
			System.out.println("hi");
	}
	

}
