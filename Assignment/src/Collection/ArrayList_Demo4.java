package Collection;

import java.util.ArrayList;

//Program for to delete all elements from ArrayList
public class ArrayList_Demo4 {
public static void main(String[] args) {
	ArrayList<String> arr1 =new ArrayList<>();
	arr1.add("Zero");
	arr1.add("First");
	arr1.add("Second");
	arr1.add("Third");
	arr1.add("Random");
	System.out.println("Actual ArrayList:"+arr1);
	arr1.clear();
	System.out.println("\n After clear ArrayList:"+arr1);
}
}
