package Demo1;

public class JobA extends Thread{
	@Override
	public void run(){
		for(int i=0;i<100;i++){
			{
				try{
					Thread.currentThread().sleep(200);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				if(i%2==0)
					System.out.println(i);
			}
		}
	}
}

