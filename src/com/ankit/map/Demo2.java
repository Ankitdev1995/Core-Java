package com.ankit.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
public static void main(String[] args) {
	// to find length of every elements in this list, and push those length into some other collection
	List<String> vehicles = Arrays.asList("bus","scooter","bike","cart","flight","train");

	// before java 8(without using streams)
	for(String name:vehicles) {
		System.out.println(name.length());
	}
	System.out.println("******************");

	//java 8(with streams)	
	vehicles.stream().map(vhn->vhn.length()).forEach(len->System.out.println(len));
	System.out.println("****************");
	
	vehicles.stream().map(vhn1->vhn1.length()).forEach(System.out::println);
	System.out.println("****************");
		
	List l = vehicles.stream().map(vname->vname.length()).collect(Collectors.toList());
	System.out.println(l);
	}

}
