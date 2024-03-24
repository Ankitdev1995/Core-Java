package Garbage_Collection;

public class Daemon_ThreadTest {
public static void main(String[] args) {
	System.out.println("Main Thread");
	Daemon_Thread obj=new Daemon_Thread ();
	obj.setDaemon(true);
	obj.start();
}
}
