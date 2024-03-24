package com.ankit.allMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//findAny()
//findFirst()
public class Demo3 {
public static void main(String[] args) {
	
	List<String> stringlist1  = Arrays.asList();//NoSuchElementException
	List<String> stringlist2  = Arrays.asList("five","two","three","one");

	Optional<String>  ele = stringlist1.stream().findAny();
//	System.out.println(ele.get());
	
     //	findFirst()
	List<String>stringlist3 = Arrays.asList("zero","two","three","one","four");
  Optional<String>elee = stringlist3.stream().findFirst();
  System.out.println(elee.get());
}
}
