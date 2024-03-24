package Demo;
// this is a pojo class
public class Person { 
	private	String age;
	private String loc;

	public Person() {
		super();
	}
	public Person(String sid, String loc) {
		super();
		this.age = sid;
		this.loc = loc;
	}

	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", loc=" + loc + "]";
	}

}
