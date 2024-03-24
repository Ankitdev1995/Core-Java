package Demo3;

public class job extends Thread {
	@Override
	public void run(){
	for(int i=1;i<20;i++){
	try{
		Thread.currentThread().sleep(1000);
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	if(i%2==0)
		System.out.println(Thread.currentThread().getName()+i);
	}
	}
}