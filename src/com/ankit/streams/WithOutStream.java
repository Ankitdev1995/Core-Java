
package com.ankit.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithOutStream {
	public static void main(String[] args) {
		List<Integer> numbers1 = Arrays.asList(11,16,21,26,31,62,83);
		List<Integer>evenNumbersList = new ArrayList<Integer>();

		System.out.println(numbers1);
		System.out.println("********Enhanced for loop*********");

		for (int n : numbers1) {
			if(n%2==0) {
				evenNumbersList.add(n);	
			}
		}
		System.out.println(evenNumbersList);
	}
}
