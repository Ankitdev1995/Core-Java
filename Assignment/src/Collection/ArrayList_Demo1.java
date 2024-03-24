package Collection;
//program to read all elements in ArrayList by using an iterator
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo1 {
public static void main(String[] args) {
	ArrayList<String>arr1=new ArrayList<>();
	arr1.add("Pune");
	arr1.add("Mumbai");
	arr1.add("Aurangabad");
	arr1.add("Nagpur");
	
	Iterator<String>itr=arr1.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
