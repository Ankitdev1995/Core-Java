package MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		//Map Doesn't Maintain order of element
		Map<Integer,String> map1 = new HashMap<>();

		//It Maintains order of element in which you have added(Based on key)
		Map<Integer,String> map2 = new LinkedHashMap<>();

		//Sort The element Based on key
		Map<Integer,String> map3 = new TreeMap<>();

		map3.put(10, "Ankit");
		map3.put(45, "Neha");
		map3.put(12, "raja");
		map3.put(11, "Ankit");
		map3.put(33, "megha");
		map3.put(15, "raja");
		map3.put(50, "sanjna");
	
		System.out.println(map3);	
	}
}