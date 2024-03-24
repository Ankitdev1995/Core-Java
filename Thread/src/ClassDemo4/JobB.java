package ClassDemo4;

public class JobB extends Thread{
	X xb;
	public JobB(X t){
		this.xb=t;
	}
	@Override
	public void run() {
		for(int i=0;i<10000;i++)
			xb.decrement();
	}
}
