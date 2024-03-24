package com.ankit.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {
	public static void main(String[] args) {
		List<Integer>numbersList = Arrays.asList(2,3,4,5,6,7,8,9);
		List<Integer>multipliedList = new ArrayList<Integer>();

		// before java 8
		for(int num :numbersList)	{
			//System.out.println(num*3);
			multipliedList.add(num*3);

		}
		System.out.println(multipliedList);
		

		// by using streams concept
		multipliedList = numbersList.stream().map(numb->numb*3).collect(Collectors.toList());
		System.out.println(multipliedList);

		System.out.println("********************");

		numbersList.stream().map(nu->nu*3).forEach(System.out::println);
		
		System.out.println("********************");
		numbersList.stream().map(nt->nt*3).forEach(nt->System.out.println(nt));
	}
}
