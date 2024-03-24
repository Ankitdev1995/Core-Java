package Collection;
//Simple program for HashMap Demo
import java.util.HashMap;

public class HashMap_Demo {
public static void main(String[] args) {
	HashMap<String,String> hm=new HashMap<String,String>();
	hm.put("one", "java");
	hm.put("two", "By");
	hm.put("three", "Kiran");
	System.out.println(hm);
	System.out.println("value of second:="+hm.get("Two"));
	System.out.println("Is HashMap Empty:"+hm.isEmpty());
	hm.remove("Third");
	System.out.println(hm);
	System.out.println("Size of the HashMap:"+hm.size());

}
}
