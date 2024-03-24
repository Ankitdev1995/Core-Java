package HashMap;

import java.util.HashMap;

public class Test {
public static void main(String[] args) {
	HashMap<Integer,String>stulist=new HashMap<Integer,String>();
		
	stulist.put(33, "rani");
	stulist.put(10, "raja");
	stulist.put(34, "revti");
	stulist.put(12, "rajlakshmi");
	stulist.put(36, "raman");
	String s = stulist.get(12);
	System.out.println(s);
}
}
