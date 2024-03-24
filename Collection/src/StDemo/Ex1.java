package StDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*set is not an index based data structure it stores the 
data according to the Hashcode values*/
// does not follows insertion order
// duplicate elements are not allowed
// multiple null values are not allowed

public class Ex1 {
public static void main(String[] args) {
	
	Set s = new HashSet();
	s.add(100);
	s.add(200);
	s.add(300);
	s.add(400);
	s.add(200);
	s.add(null);
	s.add(null);
	
	System.out.println(s);
	
	Iterator itr = s.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
}
}
