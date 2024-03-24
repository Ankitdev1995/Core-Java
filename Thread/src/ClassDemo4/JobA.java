package ClassDemo4;

public class JobA extends Thread{
	X xa;
	public JobA(X t){
		this.xa=t;
	}
	@Override
	public void run() {
		for(int i=0;i<10000;i++)
		xa.increment();
	}

}
