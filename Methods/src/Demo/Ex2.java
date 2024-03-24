package Demo;
/* write a method to reverse a given number. 
   write a method to compute sum of given number. */
 
public class Ex2 {
	int reverse(int no){
		int sum=0,r;
		while(no>0){
			r=no%10;
			sum=(sum*10)+r;
			no=no/10;
		}
	return sum;
	}

	int sumofdigit(int no){
		int sum=0,r;
		while(no>0){
			r=no%10;
			sum=sum+r;
			no=no/10;
		}
	return sum;
	}
	}