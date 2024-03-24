package com.ankit.allMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	//sorted = sort the objects in the collections, first we need to add in stream	
	public static void main(String[] args) {

	List<Integer> list1 = Arrays.asList(2,4,6,7,1,9,6,4,0,2,1);

	List<Integer>sortedList	= list1.stream().sorted().collect(Collectors.toList());
	System.out.println("Sorted in ascending order ==>"+sortedList);
	
	System.out.println("**********************");
	List<Integer>reverseorder = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println("Elements in reverse order"+reverseorder);
	
	System.out.println("*******Actual String****************");
	List<String> stringele = Arrays.asList("njiula","sankya","pistul","aadya","vishlya","cachya","jnkit");
	System.out.println(stringele);
	
	System.out.println("******Sorted String*************");
	List<String> Sortedform	= stringele.stream().sorted().collect(Collectors.toList());
	System.out.println(Sortedform);
	
	System.out.println("******reverse String*************");
	List<String> reverseString= stringele.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(reverseString);
	
	
	}
}
