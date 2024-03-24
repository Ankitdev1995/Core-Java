package com.ankit.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
// sometimes filters contains multiple conditions also
public static void main(String[] args) {
	
	List<String> names = Arrays.asList("ratnaka","vijayalakshmi","viju","sitaramji","sinadekh","davidji","virendra");
	// filter the list of element whose length of the name is greater than 6 and less than 8
	
	List<String>longnames = new ArrayList<String>();
	// first we need to add this collection to the stream
	// filter is always take a predicate, and return true or false
	longnames = names.stream().filter(str->str.length()>4 && str.length()<9).collect(Collectors.toList());
	System.out.println(longnames);
	
// suppose if we don't want to put in some other collection	, we just want to print
	System.out.println("**********************");	
// foreach method take consumer  	
	names.stream().filter(str->str.length()>5 && str.length()<8).forEach(str->System.out.println(str));
System.out.println("******************");	
	names.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);
	
	
}	
}
