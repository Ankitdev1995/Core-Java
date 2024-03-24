package TextBook;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionTest {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("java");
	al.add("By");
	al.add("Kiran");
	
	System.out.println("Before Sorting"+al);
	
	Collections.sort(al);
	System.out.println("After Sorting"+al);


}
}
