package WithSync;

public class Job extends Thread{
	int a=0;
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("t1")){
			synchronized(this){
				for(int i=0;i<=100000;i++){
					a=a+1;
					System.out.println("Increment");
				}
			}
		}
	if(Thread.currentThread().getName().equals("t2")){
		synchronized(this){
			for(int i=0;i<=100000;i++){
				a=a-1;
				System.out.println("Decrement");
			}
		}
	}
	}
}