package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Entry_Ex {
	public static void main(String[] args) {

		HashMap<Integer,String>stulist = new HashMap<Integer,String>();

		stulist.put(22, "Ankit");
		stulist.put(11, "Prashant");
		stulist.put(17, "Pranil");
		stulist.put(9, "Ankit");
		stulist.put(14, "Sachin");

		String s = stulist.get(9);
		Set<Integer>set = stulist.keySet();
		System.out.println(set);

		System.out.println("======Only Integer(Key)=====");

		Set<Integer>set1 = stulist.keySet();
		Iterator<Integer>itr = set1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		System.out.println("========Only String=========");

		Collection<String>collection = stulist.values();
		Iterator<String>itrs=collection.iterator();
		itrs.hasNext();
		while(itrs.hasNext())
			System.out.println(itrs.next());

		System.out.println("=====Integer and String both======");

		Set<Entry<Integer,String>> entries = stulist.entrySet();

		for(Entry<Integer,String>entry:entries){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("====By using For Each(JAVA 1.8) ======");

		stulist.forEach((k,v)->System.out.println(k+" "+v));

	}
}
