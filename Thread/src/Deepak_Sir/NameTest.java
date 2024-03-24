package Deepak_Sir;

public class NameTest {
public static void main(String[] args) {
	System.out.println("Hello is printed by:"+ Thread.currentThread().getName());

	Name obj=new Name();
	obj.start();

	Name obj1 =new Name();
	obj1.start();
	
	System.out.println(Thread.currentThread().isAlive());
	System.out.println(obj.isAlive());
}
}
