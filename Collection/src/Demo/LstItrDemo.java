package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LstItrDemo {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add(10);
	l.add("sam");
	l.add("samiksha");
	
	ListIterator litr=l.listIterator();
	while(litr.hasNext()){
		System.out.println(litr.next());
	}
	System.out.println("=================");
	
	while(litr.hasPrevious()){
		System.out.println(litr.previous());
		}
	System.out.println("===================");
	
	l.remove("sam");
	System.out.println(l);

	System.out.println("================");
	
	l.add(200);
	System.out.println(l);
	
	System.out.println("==============");
	
	l.set(0, "palash");
	System.out.println(l);
}
}
