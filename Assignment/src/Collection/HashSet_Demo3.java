package Collection;
/* program for compare two sets and 
retain elements which are same on both hashsets */
import java.util.HashSet;

public class HashSet_Demo3 {
public static void main(String[] args) {
	HashSet<String>hs=new HashSet<>();
	hs.add("Java");
	hs.add("By");
	hs.add("Kiran");
	hs.add("Karvenagar");
	hs.add("pune");
	
	System.out.println("First HshSet:"+ hs);

	HashSet<String> subSet=new HashSet<>();
	subSet.add("Java");
	subSet.add("J2EE");
	subSet.add("Selenium");
	
	System.out.println("Second Hashset:"+subSet);
	
	hs.retainAll(subSet);
	System.out.println("Common Hashset content from both:");
	
	System.out.println(hs);
}
}
