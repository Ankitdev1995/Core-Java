package ClassDemo4;

public class Test {
public static void main(String[] args) throws InterruptedException {
	X obj=new X();
	JobA ja=new JobA(obj);
	JobB jb=new JobB(obj);
	
	ja.start();
	jb.start();
	
	ja.join();
	jb.join();
	
	System.out.println(obj.c);
}
}
