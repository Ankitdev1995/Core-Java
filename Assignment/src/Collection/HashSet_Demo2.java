package Collection;
import java.util.HashSet;
import java.util.Iterator;

//Program for to iterate HashSet element through iterator
public class HashSet_Demo2 {
public static void main(String[] args) {
	HashSet<String>hs=new HashSet<>();
	hs.add("Java");
	hs.add("By");
	hs.add("Kiran");
	Iterator<String> itr=hs.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
