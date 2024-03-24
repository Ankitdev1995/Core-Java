package com.ankit.allMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
public static void main(String[] args) {
	

	List<String>animallist = Arrays.asList("Dog","Cat","Elephant");
    List<String>birdslist  = Arrays.asList("peakcock","parrot","crow");

    Stream <String>stream1 = animallist.stream();
    Stream <String>stream2 = birdslist.stream();
    
     List<String>finallist = Stream.concat(stream1, stream2).collect(Collectors.toList());
     for (String items : finallist) {
		System.out.println(items);
	}

}
}