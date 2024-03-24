package com.ankit.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTheory {
//  map() method will transform the data from 
//	the source and we can get that data into target
//  It means whatever the data or object in the 
//	collections by using map we can transform it.
	
	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train","bullakcart"); 
//  we want to transform this collection like we want to perform uppercase operation 
//	on each element, and store it in other collection	
	
// without using stream	(before java 8)

		List<String> vehicleListInUpperCase = new ArrayList<String>() ;
		for( String name :vehicles) {
			vehicleListInUpperCase.add(name.toUpperCase());
		}

	System.out.println("=====without using stream=====");	
	System.out.println(vehicleListInUpperCase);
		
	System.out.println("=====with stream =====");
	// with stream (map)	(java 8)
	// map will accept function
	// we need to add this collection to the stream,then apply map,
	// map is always use a function
	
	
	vehicleListInUpperCase = vehicles.stream().map(nam->nam.toUpperCase()).collect(Collectors.toList());
	System.out.println(vehicleListInUpperCase);
}
}

