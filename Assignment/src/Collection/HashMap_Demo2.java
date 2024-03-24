package Collection;

import java.util.HashMap;
import java.util.Set;

//Program for Iterating through each key get corresponding value object
public class HashMap_Demo2 {
public static void main(String[] args) {
	HashMap<String,String> hm=new HashMap<String,String>();
	hm.put("First", "Java");
	hm.put("Second", "By");
	hm.put("Third", "Kiran");
	System.out.println(hm);
	
	Set<String>keys=hm.keySet();
	for(String key:keys){
		System.out.println("Value of"+" "+key+" "+"is:"+hm.get(key));
	}
	}
}
