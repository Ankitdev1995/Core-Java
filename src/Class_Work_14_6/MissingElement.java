package Class_Work_14_6;

public class MissingElement {
	
public static void main(String[] args) {
	
	int a[]={1,2,};
	int E_sum=a.length+1;
	int T_sum=(E_sum*(E_sum+1))/2;
	int sum=0;
	for(int i=0;i<a.length;i++){
		sum=sum+a[i];
	}
	System.out.println(T_sum-sum);
	}
}
