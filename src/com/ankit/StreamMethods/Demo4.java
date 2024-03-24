package com.ankit.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo4 {
public static void main(String[] args) {
// Reduce() method
// It will combine the objects into single Stream	

	List<String>stringList = Arrays.asList("A","B","C","1","2","3","4","5");
Optional<String>reduced	=stringList.stream().reduce((value,combinevalue)->{
		return combinevalue+value;
	});
	
	System.out.println(reduced.get());
	}
}
