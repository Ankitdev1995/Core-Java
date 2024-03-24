package Collection;

import java.util.ArrayList;

//program for display arraylist and its operation
public class ArrayList_Demo2 {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("PERL");
		a1.add("PHP");
	
		System.out.println(a1);
		System.out.println("Element at index1:"+a1.get(1));
		System.out.println("Does list contains JAVA?"+a1.contains("JAVA"));
		System.out.println(a1);
		System.out.println("Is arraylist is empty?"+a1.isEmpty());
		System.out.println("Index of PERL is:"+ a1.indexOf("PERL"));
		System.out.println("Size of arraylist is:"+a1.size());
	}
}
