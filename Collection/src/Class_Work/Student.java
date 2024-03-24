package Class_Work;

public class Student {
	int id;
	String name;
	float per;
	String course;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + ", course=" + course + "]";
	}
	public Student(int id, String name, float per, String course) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
		this.course = course;
	}

}
