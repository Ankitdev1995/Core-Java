package Logic;

public class Armstrong_no {
	public static void main(String[] args) {
		
	int n=153;
	int r, sum=0, t=n;
	while(n>0){
		r=n%10;
		n=n/10;
		sum=sum+(r*r*r);
	}
	if (t==sum)
	System.out.println("Number is Armstrong");
	else
		System.out.println("Number is not Armstrong");
}
}
