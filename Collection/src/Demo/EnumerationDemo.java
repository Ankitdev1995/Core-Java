package Demo;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
public static void main(String[] args) {
	
	Vector v = new Vector();
	v.add(10);
	v.add("sachin");
	v.add(56.78);
	
	System.out.println(v);
	
	System.out.println("========= By using Enumeration ===========");
	
	Enumeration en = v.elements();
	
	while(en.hasMoreElements()){
		System.out.println(en.nextElement());
	
	}
}
}
