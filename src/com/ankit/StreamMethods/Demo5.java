package com.ankit.StreamMethods;

import java.util.Arrays;
import java.util.List;

public class Demo5 {
public static void main(String[] args) {
	List<String>stringlist = Arrays.asList("A","B","C","D","1","2","3");
Object arr[]= stringlist.stream().toArray();
System.out.println(arr.length);

System.out.println("*******");
for(Object v : arr) {
	System.out.println(v);
}
}
}
