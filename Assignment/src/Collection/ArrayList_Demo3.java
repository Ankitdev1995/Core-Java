package Collection;
//program for to add all elements of a list to ArrayList
import java.util.ArrayList;
import java.util.List;

public class ArrayList_Demo3 {
public static void main(String[] args) {
	ArrayList<String>arr1=new ArrayList<>();
	arr1.add("First");
	arr1.add("Second");
	arr1.add("Third");
	arr1.add("Random");
	System.out.println("Before Actual ArrayList:"+arr1);
	
	ArrayList<String>list=new ArrayList<>();
	list.add("one");
	list.add("two");
	arr1.addAll(list);
	System.out.println("\n After Copy ArrayList"+arr1);
	
}
}
