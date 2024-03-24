package Demo;

public class Test {
public static void main(String[] args) {
	JobA a=new JobA();
	JobB b=new JobB();
	JobC c=new JobC();
	a.start();
	b.start();
	c.start();
}
}
