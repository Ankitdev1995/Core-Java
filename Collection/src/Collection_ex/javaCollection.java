package Collection_ex;

import java.util.ArrayList;

public class javaCollection {
	public static void main(String[] args) {

		ArrayList<String> Name = new ArrayList<String>();

		Name.add("Ankit");
		Name.add("Raj");
		System.out.println(Name);

		Name.add(2, "rohit");
	//	System.out.println(Name);
	//	Name.add(0,"Akshay");
		System.out.println(Name);

		Name.set(0,"Akshay");
		System.out.println(Name);
	}
}
