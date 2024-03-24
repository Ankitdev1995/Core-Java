package Static_demo;

public class Student {
	int id;
	String name;
	String course;
	int marks;
	static int totalmarks=800; //Single copy storage
	
	Student(int id,String name,String course,int marks){
		this.id=id;
		this.name=name;
		this.course=course;
		this.marks=marks;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}
}
