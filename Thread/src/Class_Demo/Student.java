package Class_Demo;

import java.io.Serializable;

public class Student implements Serializable,Comparable,Cloneable{
private int id;
private String name;
private String course;
private float per;
public Student(int id, String name, String course,float per) {
	super();
	this.id = id;
	this.name = name;
	this.course = course;
	this.per=per;
	
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
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public float getPer() {
	return per;
}
public void setPer(float per) {
	this.per = per;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", course=" + course + ", per=" + per + "]";
}
@Override
	public int compareTo(Object o) {
			Student s = (Student)o;
		if(this.id>s.id)
			return 1;
			else if(this.id<s.id){
				return -1;
			}
			else
		return 0;
	}
	@Override
		public Object clone() throws CloneNotSupportedException {
			return id;
		}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(per);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(per) != Float.floatToIntBits(other.per))
			return false;
		return true;
	}
	
	}
