package Deepak_Sir;

public class Test extends Thread{
@Override
public void run() {
	System.out.println("Thread Task");
	
}
	public static void main(String[] args){
		Test t=new Test();
		t.start();
	}
}
