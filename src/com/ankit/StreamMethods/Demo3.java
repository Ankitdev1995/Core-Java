package com.ankit.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
public static void main(String[] args) {
	// maximumValue
	
	List<Integer> numberslist = Arrays.asList(23,685,87,45,19,16,29,50,29,15);
	
Optional<Integer>maximumValue= numberslist.stream().max((value1,value2)->{
		return value1.compareTo(value2);
	});
System.out.println(maximumValue.get());
}
}
