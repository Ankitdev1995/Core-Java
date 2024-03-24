package this_student;

public class Test_student {
public static void main(String[] args) {
	
	Student a1 = new Student();
	Student a2 = new Student();
	Student a3 = new Student();
	Student a4 = new Student();
	
	a1.accept (101,"sandy",600, 150,160,170);
	a2.accept (102,"candy",600, 132,120,150);
	a3.accept (103,"bandy",600, 155,166,177);
	a4.accept (104,"mandy",600, 100,140,170);
	
	a1.operation();
	a2.operation();
	a3.operation();
	a4.operation();
	
	a1.display();
	a2.display();  
	a3.display();
	a4.display();
	
}
}
