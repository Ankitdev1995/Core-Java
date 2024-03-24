package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Demo {
public static void main(String[] args) {
	HashMap<String, String> hm  = new HashMap();
	hm.put("10", "Raj");
	System.out.println(hm.put("10", "Raj"));
	Set<String> k1=hm.keySet();
	for(String s1:k1) {
		System.out.println(hm.get(s1));
	}
	String s1=hm.put("10", "Vidhi");
	//System.out.println(s1);
}
}
