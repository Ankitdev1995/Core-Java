package com.ankit.parallelStream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamEx {
public static void main(String[] args) {
	
	List<Student> studlist = Arrays.asList(
			new Student("David", 89),
			new Student("jhon", 91),
			new Student("rasnik", 75),
			new Student("erick", 73),
			new Student("vijaya", 95),
			new Student("smit", 69)
			);
	// normal stream (sequential)
	 studlist.stream()
	.filter(s->s.getScore()>=80)
	.limit(5)
	.forEach(d->System.out.println(d.getName()+":"+d.getScore()));	
	System.out.println("****************");
	
	// using parallel stream
	studlist.parallelStream()
	.filter(s->s.getScore()>=80)
	.limit(5)
	.forEach(d->System.out.println(d.getName()+":"+d.getScore()));	

	System.out.println("*****************");
// convert stream ()--parallelStream() 
// parallel() 
	
	studlist.stream().parallel().filter(s->s.getScore()>=80)
				.limit(5)
	.forEach(d->System.out.println(d.getName()+":"+d.getScore()));	
	
	
}
}
