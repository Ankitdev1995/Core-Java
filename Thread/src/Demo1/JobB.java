package Demo1;

public class JobB extends Thread{
	@Override
	public void run(){
		System.out.println("Block B");
		while(true){
			try{
				Thread.currentThread().sleep(200);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Hello.......");
		}
	}
}
