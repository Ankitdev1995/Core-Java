package LtDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
// list is an index based data structure
// list follows insertion order
// duplicate elements are allowed
// multiple null elements can storedc
// iterator iterates elements one by one
public class Ex1 {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(0,10);
		l.add(1,20);
		l.add("ram"); 
		l.add(3,40); 
		l.add(4,50);
		l.add(5,null);
		l.add(6,null);
		System.out.println(l);

		// System.out.println("==Iterate only in forward direction=="); 

		/*Iterator itr = l.iterator();
	   while(itr.hasNext()){
		 System.out.println(itr.next());
	   }*/
		System.out.println("==Iterate in forward and backward direction==");

		System.out.println("===forward===");
		ListIterator ltr =l.listIterator();
		while(ltr.hasNext()){
			System.out.println(ltr.next());
		}
		System.out.println("==backward==");
		ListIterator ltr1=l.listIterator();	
		while(ltr1.hasPrevious()){
		}
	}
}
