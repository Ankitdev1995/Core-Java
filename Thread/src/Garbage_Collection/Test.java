package Garbage_Collection;

public class Test {
public static void main(String[] args) {

	
		Student s1=new Student(21,"abhi","ME",8.9f);
	
		System.out.println(s1);
	s1=null;
		
		System.gc();	
		System.gc();
		System.gc();
}
}