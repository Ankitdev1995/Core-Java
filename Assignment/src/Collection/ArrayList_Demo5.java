package Collection;
/* program to find does ArrayList 
contains all list elements or not */
import java.util.ArrayList;

public class ArrayList_Demo5 {
public static void main(String[] args) {
	ArrayList<String> arr1=new ArrayList<>();
	arr1.add("First");
	arr1.add("Second");
	arr1.add("Third");
	arr1.add("Random");
	ArrayList<String> list=new ArrayList<>();
	list.add("Second");
	list.add("Random");
	System.out.println("Does ArrayList Contains All list elements?:"+arr1.containsAll(list));
	list.add("one");
	System.out.println("\n Does ArrayList contains all list elements?:"+arr1.containsAll(list));
}
}