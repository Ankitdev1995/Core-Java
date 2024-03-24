package Test.Demo1;

public class A {
public int reverse(int no){
	int sum=0;
	while(no>0){
		sum=sum*10+no%10;
	no=no/10;
	}
	return sum;
	}
	
public int sumofdigit (int no){
	int sum=0,r;
	while(no>0){
		r=no%10;
		no=no/10;
		 
		sum=sum+r;
	}
	return sum;
}
}
