package Logic;

public class Armstrong_no_1 {
 public static void main(String[] args) {
	for(int i=1;i<=10000;i++){
		int n=i;
		int r, sum=0,t=n,counter=0;
	while(n>0){
			r=n%10;
			n=n/10;
			counter++;
		}
		while(n>0){
				r=n%10;
				n=n/10;
				sum=sum+(int)Math.pow(r, counter);
			}
	
		if(t==sum)
		System.out.println(t+ " is Armstrong no");
		
		
		}
	}

}