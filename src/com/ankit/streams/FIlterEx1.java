package com.ankit.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FIlterEx1 {
public static void main(String[] args) {
	ArrayList<Integer>numbers = new ArrayList<Integer>();
	
	numbers.add(10);
	numbers.add(15);
	numbers.add(20);
	numbers.add(25);
	numbers.add(30);

//	List<Integer>numbers = Arrays.asList(5,10,15,20,25,30,35,40,45,50);
//	Predicate<Integer> p = s->s%2=0;
//	for(int i :numbers) {
//		if(p.test(i)) 
//			System.out.println(i);
	List<Integer> numbers1 = Arrays.asList(11,16,21,26,31);
	List<Integer> evenNumbersList = new ArrayList<Integer>();
	
	System.out.println(numbers1);
}
}

