package Static_demo;

public class Test {
public static void main(String[] args) {
	Student s1=new Student(345,"nisha","BE",600);
	Student s2=new Student(346,"pisha","BE",650);
	Student s3=new Student(347,"kisha","BE",670);
	Student s4=new Student(348,"isha","BE",680);
	Student s5=new Student(349,"jisha","BE",690); 
	
	System.out.println(s1.totalmarks);
	System.out.println(s2.totalmarks);
	System.out.println(s3.totalmarks);
	s4.totalmarks=900;
	System.out.println(s4.totalmarks);
	System.out.println(s5.totalmarks);
}
}