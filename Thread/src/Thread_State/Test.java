package Thread_State;

public class Test {
public static void main(String[] args) throws InterruptedException {
	JobA j=new JobA();
	System.out.println(j.getState());
	
	j.start();
	System.out.println(j.getState());

	j.join();
	System.out.println(j.getState());
}
}
