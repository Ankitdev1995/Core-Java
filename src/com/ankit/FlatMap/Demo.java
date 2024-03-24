package com.ankit.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
public static void main(String[] args) {
	// map()	
	List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
	List<Integer> list2 = list1.stream().map(s->s*s).collect(Collectors.toList());
	System.out.println("map:"+list2);
	
	// FLatmap()	
List<Integer> list3 = Arrays.asList(11,12);
List<Integer> list4 = Arrays.asList(13,14);
List<Integer> list5 = Arrays.asList(15,16);		

List<List<Integer>> finalList = Arrays.asList(list3,list4,list5); 
// flatmap will take function as an argument
 List<Integer> finalResult = finalList.stream().flatMap(x->x.stream().map(n->n*10)).collect(Collectors.toList());
System.out.println("Flat Map:"+finalResult);
	
// flat map will take 1 collection argument, add that collection into stream, and it will return stream of object	
	
}
}
