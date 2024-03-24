package Logic;
// find sum of digit and also count the number
public class Sum_Of_Digit {
public static void main(String[] args) {
	int n=1234955;
	int r,sum=0, counter=0;
	
	while(n>0){
		r=n%10;
		n=n/10;
		sum=sum+r;
		counter++;
	}
	System.out.println("sum of digit is                                                       :"+sum);
	
	System.out.println("number of digit is :"+counter);

}
}
