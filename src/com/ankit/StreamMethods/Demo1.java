package com.ankit.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// distinct(), limit() ==> It is used for the processing the object from the collections
// count()
public class Demo1 {
	public static void main(String[] args) {
		List<String>vehiclesList = Arrays.asList("bus","car","bicycle","helicopter","car","truck","bike","bicycle","car");
		System.out.println("Vehicle form the list:"+vehiclesList);
		List<String> distinctVehicles1= vehiclesList.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct vechicles from list:"+distinctVehicles1);

		// It doesn't return any list
		vehiclesList.stream().distinct().forEach(value->System.out.println(value));
		System.out.println("******************");	
		// from the stream distinct will also return one stream, 
		// and that stream contains distinct elements/ objects
		// from those objects foreach() method will get each and 
		// every object into this function and we will print that

		// count
		// I just want to count how many distinct element in the collections		 

		long count =  vehiclesList.stream().distinct().count();	 

		System.out.println(count);
		System.out.println("*******************");	 
		// limit
		// I want to collect some limited object		 

		List<String>limitedVehiclesList = vehiclesList.stream().limit(3).collect(Collectors.toList());


		System.out.println("Limited Vehicles"+limitedVehiclesList);
		System.out.println("*******************");	 
		vehiclesList.stream().limit(7).forEach(value->System.out.println(value)); 	 
	}
}
