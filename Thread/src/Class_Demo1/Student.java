package Class_Demo1;

import java.io.Serializable;

public class Student implements Serializable,Comparable<Student>,Cloneable {
private int id;
private String name;
private String Course;
private float per;

public Student(int id, String name, String Course, float per) {
	super();
	this.id = id;
	this.name = name;
	this.Course=Course;
	this.per = per;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return Course;
}
public void setCourse(String Course) {
	this.Course = Course;
}
public float getper() {
	return per;
}
public void setper(float per) {
	this.per = per;
}
	@Override
		public int compareTo(Student e) {
		if(this.getId()>e.getId())
			return 1;
		else if(e.getId()>this.getId()){
			return -1;
		}else
		return 0;
		}
	@Override
		public boolean equals(Object obj) {
			Student e=(Student)obj;
			if(this.id==e.getId()&&
			this.name.equals(e.getName())&&
			this.Course.equals(e.getCourse())&&
			this.getper()==e.getper())
				
				return true;
			else
				return false;
	
	}
	@Override
		public int hashCode() {
				return super.hashCode();
		}
	@Override
		public Object clone() throws CloneNotSupportedException {
			
			return super.clone();
		}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Course=" + Course + ", per=" + per + "]";
	}

}



