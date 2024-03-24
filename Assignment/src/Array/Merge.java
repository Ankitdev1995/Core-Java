package Array;

import java.util.Arrays;

public class Merge {
public static void main(String[] args) {
	int[]values={10,20,30};
	int[]values2={100,200,300};
	int[]merge=new int[values.length+values2.length];
	
	for(int i=0;i<values.length;i++){
		merge[i]=values[i];
	}
	for(int i=0;i<values2.length;i++){
		merge[i+values.length]=values2[i];
	}
	System.out.println(Arrays.toString(merge));
	}
	
}

