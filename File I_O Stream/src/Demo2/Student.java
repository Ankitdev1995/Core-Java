package Demo2;

import java.io.Serializable;

public class Student implements Serializable{
transient int id; 
String name;
String country;
public Student(int id, String name, String country) {
	super();
	this.id = id;
	this.name = name;
	this.country = country;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", country=" + country + "]";
}

}
