package jdk8;

import java.util.List;

public class addnumbers {
	int sumofnumber (List<Integer>list){
	int sum=0;
	for (int no : list) {
		if(no>10) {
			sum=sum+no;
		}
	}
	return sum;
	}
}
