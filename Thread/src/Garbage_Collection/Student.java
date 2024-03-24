package Garbage_Collection;

public class Student {
	int id ;
	String name;
	String course;
	float gp;

	public Student(int id, String name, String course, float gp) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.gp = gp;

	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", gp=" + gp + "]";
	}
	@Override
	protected void finalize() throws Throwable {
	System.out.println("let me go peacefully");
	}
}

