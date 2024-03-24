package this_student;

public class Test {
	public static void main(String[] args) {
		
Book B1= new Book();
Book B2= new Book();
Book B3= new Book();
Book B4= new Book();

B1.accept(101,"maths","harry",240.45f,45788194,"westland");
B2.accept(102,"geo","peter",345.32f,6734145,"mcgra");
B3.accept(103,"polity","sunny",389.56f,127837659,"anchor");
B4.accept(104,"science","mac",346.64f,58498374,"ween");

B1.display();
B2.display();
B3.display();
B4.display();
}
}