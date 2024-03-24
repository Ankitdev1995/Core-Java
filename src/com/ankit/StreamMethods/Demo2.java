package com.ankit.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(11,24,73,14,54,6,27,8,96,10);
	
	// count()	
		long  numberOfEvenNumbers = numbersList.stream().filter(num->num%2==0).count();
		System.out.println(numberOfEvenNumbers);
	
	// min() ==>It will take comparator as a input argument
	// optional class is the return type of min() method 
	// and get() method is itself available in Optional Class	
		Optional <Integer>min = numbersList.stream().min((val1,val2)->{
			return val1.compareTo(val2);
					});
	System.out.println(min.get());
	}
}
