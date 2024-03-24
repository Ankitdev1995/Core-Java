package Logic;

public class Prime_no_1 {
public static void main(String[] args) {
int n=20;
int Counter=0;
for(int i=1; i<=n;i++){
	if(n%i==0){
		Counter++;
	}
	}	
	System.out.println(Counter);
	if(Counter==2){
	 System.out.println(n+ " "+ "is prime number");}
	else{
	System.out.println(n+ " "+ "is not prime number");
	}
}
} 