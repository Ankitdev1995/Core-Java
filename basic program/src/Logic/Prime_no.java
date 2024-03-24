package Logic;
// Find 1 to 100 Prime no
public class Prime_no {
	public static void main(String[] args) {
		for(int j=1;j<=100;j++){
		int n=j;
		int counter=0;
		for(int i=1; i<=n;i++){
			if(n%i==0){
			counter++;
			}	
		}
		if (counter==2)	{
			System.out.println(n+ " is prime ");
		
		}
		}
	}
}
