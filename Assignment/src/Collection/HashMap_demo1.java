package Collection;
//Program for copy Map content to another HashMap
import java.util.HashMap;

public class HashMap_demo1 {
public static void main(String[] args) {
	HashMap<String,String>hm=new HashMap<String,String>();
	hm.put("first", "Java");
	hm.put("Second", "By");
	hm.put("third", "Kiran");
	System.out.println(hm);

	HashMap<String,String>hm1=new HashMap<String,String>();
	hm1.put("c1", "Java");
	hm1.put("c2", "SELENIUM");
	hm.putAll(hm1);
	System.out.println(hm);
}
}
