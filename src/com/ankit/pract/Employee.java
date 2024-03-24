package com.ankit.pract;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
public static void main(String[] args) {
	
	List<String> em = Arrays.asList("Sukrutkale","sdfghjklkjhgf","dfghj","vcvbn","nbvcvj"); 
	List<String> str = em.stream().filter(s->s.length()>=5 && s.length()<8).collect(Collectors.toList());

	System.out.println(str);
}
}
