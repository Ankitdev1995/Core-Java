package Demo;

public class X {
int age;
String loc;
String phone;

public X(int age, String loc, String phone) {
	super();
	this.age = age;
	this.loc = loc;
	this.phone = phone;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getLoc() {
	return loc;
}

public void setLoc(String loc) {
	this.loc = loc;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

@Override
public String toString() {
	return "X [age=" + age + ", loc=" + loc + ", phone=" + phone + "]";
}

}
// here by default eclipse gave toString
//method inside that Method all global
//variables are printed you can change if needed   