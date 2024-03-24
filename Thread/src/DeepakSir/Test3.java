package DeepakSir;
//Performing multiple task from multiple thread
public class Test3 {
public static void main(String[] args) {
	Demo3 th1=new Demo3();
	th1.start();
	
	Demo3a th2=new Demo3a();
	th2.start();
	
	Demo3b th3=new Demo3b();
	th3.start();
	
	Demo3c th4=new Demo3c();
	th4.start();
	
}
}
