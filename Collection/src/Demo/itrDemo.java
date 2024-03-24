package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class itrDemo {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(10);
		list.add("deepak");
		list.add("Sachin");
		System.out.println(list);

		Iterator itr = list.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());

			list.add(788);
			System.out.println(list);
			
			list.set(1, "om");
			System.out.println(list);
		}
	}
}
