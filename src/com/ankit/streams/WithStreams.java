package com.ankit.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreams {
public static void main(String[] args) {
//  we have a collection having number of elements or objects, 
//	to process this elements, or to filter this element, 
//	we are not directly filtering the collection, we just add
//	this data into the stream, and stream is having certain no.of methods 
//	like filter, map, sorted etc.before applying all this methods 
//  first of all we need to add this methods to the stream, then we can process the data.	


// first of all we need to add our collection to the stream for that collection.stream() method we used.
// to process the data in the stream we have a filter() method, we have to specify condition in the form of predicate
// once condition is verified, then we are going to collecting data by collect method, and put the data in another list 	
	
List<Integer>numbers = Arrays.asList(5,10,15,20,25,30,35,40,45,50);
	
	// List<Integer>evenNumbersList = new ArrayList<Integer>();	
	// It is predicate type lambda expression
	// filter methods take predicate argument
	// evenNumbersList = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
	// System.out.println(evenNumbersList);

	// We don't want to store our data in any other collection, we want to print data directly
	// therefore use
	
	numbers.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	// Its a consumer type lambda expression foreach method take consumer 
	// arguments we are adding this collection to the stream, then we are filtering,
	// after filtering whatever data we are getting, getting each and every element, 
	// and passing that  data into the lambda expression 
	// and which will basically printing the data.
	System.out.println("************");
	numbers.stream().filter(n->n%2==0).forEach(System.out::println);
}
}
