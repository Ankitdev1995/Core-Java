package Deepak_Sir;

public class Main_Thread {
public static void main(String[] args) {
	System.out.println("Hello");
	System.out.println(Thread.currentThread().getName());
	Thread.currentThread().setName("ankit");
	System.out.println(Thread.currentThread().getName());
	
}
}
