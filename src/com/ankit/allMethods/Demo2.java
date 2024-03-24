package com.ankit.allMethods;

import java.util.HashSet;
import java.util.Set;


//anyMatch()==>It will return any object from the stream
//allMatch()==>It will return boolean value
//noneMatch()	
public class Demo2 {

public static void main(String[] args) {
	Set<String> fruits = new HashSet<String>();
	
	fruits.add("one apple");
	fruits.add("one mango");
	fruits.add("Two apples");
	fruits.add("More Grapes");
	fruits.add("Two Guavas");
// 	fruits.add("More Grapes"); duplicate is not allowed
	System.out.println(fruits);
	
	// AnyMatch()
	boolean result = fruits.stream().anyMatch(value-> {return value.startsWith("More");});
	System.out.println(result);
	
	//AllMatch()
	// Every value should start with Two, then it will return true otherwise false
	 result = fruits.stream().allMatch(value-> {return value.startsWith("Two");});
	System.out.println(result);
	
	// noneMatch()
	// none of the element should not start with Two
	 result = fruits.stream().noneMatch(value-> {return value.startsWith("dfg");});
	 System.out.println(result);
		
}
}
