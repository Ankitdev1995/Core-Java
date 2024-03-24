package Static_demo;

 public class X {
  static int sumofdigit(int no){
 	int sum=0,rem;
	while(no>0){
	rem=no%10;
	sum=sum+rem;
	no=no/10;
	}
	return sum;
	}
 }
   class Y{
  static int sumofevendigit(int no){
		 int sum=0,rem;
		 while(no>0){
		rem=no%10;
		if(rem%2==0)
		sum=sum+rem;
		 no=no/10;
		}
		 	 return sum;
  }
  }
   class Z{
 static  int sumofodddigit(int no){
	int sum=0,rem;
	while(no>0){
		rem=no%10;
		if(rem%2!=0)
		sum=sum+rem;
		no=no/10;
		}
	    return sum; 
 }
 }
 
 