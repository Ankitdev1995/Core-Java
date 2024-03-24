
public class Prime {
public static void main(String[] args) {
	
	// // //Whether number is prime or not
	
	 int n=12;
	 
	int  counter=0;
	 for(int i=1; i<=n;i++){
		 
		 if(n%i==0){
		 counter++;
		 }
	 }
			 //System.out.println(counter);
		 
			 
		 if (counter==2)
		 System.out.println(n+ " is prime no" );
	 
	 else{
	  System.out.println(n+ " is not prime no");
	 }	 
}
}
