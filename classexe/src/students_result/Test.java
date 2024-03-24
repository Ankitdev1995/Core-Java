package students_result;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();		
		Student s3=new Student();
		s1.id=121;
		s1.name="Amar";
		s1.sub1=44;
		s1.sub2=55;
		s1.sub3=33;
		s1.total_marks=300;
		s1.obtain_marks();
		s1.per();
		System.out.println( "student id=="+s1.id);
		System.out.println("student name=="+s1.name);
		System.out.println("student obtained marks=="+ s1.obtain_marks);
		System.out.println("studenr per=="+s1.per);
}
}	