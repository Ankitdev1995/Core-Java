package com.ankit.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
public static void main(String[] args) {
// we want to filter the nulls values form the collections 

List<String> words = Arrays.asList("hello",null,"good","bad",null,null,"badminton", "keyboard");
// we have added the collection into the stream and then apply filter where we have check, and collect that value in other list 
List<String> result = words.stream().filter(w->w!=null).collect(Collectors.toList());
	System.out.println(result);
}
}
