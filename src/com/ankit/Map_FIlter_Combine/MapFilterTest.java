package com.ankit.Map_FIlter_Combine;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFilterTest {
	
	public static void main(String[] args) {
	List<Employee> emplist = Arrays.asList(
			new Employee(101, "raman", 100000),
			new Employee(102, "priya", 200000),
			new Employee(103, "dhanya", 300000),
			new Employee(104, "sahilya", 400000),
			new Employee(105, "premya", 500000)
			);
			
  // collection -> stream -> Filter -> map-> collect-> collection	

	// combination of filter and map
    emplist.stream()
		.filter(e1->e1.salary>200000)
		.map(e1->e1.salary).forEach(s->System.out.println(s));
		System.out.println("****************");
  
		List<Integer> li =  emplist.stream().filter(s->s.salary>300000 && s.salary<500000).map(s->s.salary).collect(Collectors.toList());
		System.out.println(li);
	 
}
}