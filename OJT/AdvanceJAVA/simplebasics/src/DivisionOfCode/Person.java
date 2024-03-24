package DivisionOfCode;

public class Person {
String sid;
String sname;

public Person(String sid, String sname) {
	super();
	this.sid = sid;
	this.sname = sname;
}
@Override
public String toString() {
	return "Person [sid=" + sid + ", sname=" + sname + "]";
}

}
