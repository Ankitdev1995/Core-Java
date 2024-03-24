package Class_Work_1_6;
//find sum of digit of each element
public class Exe3 {
public static void main(String[] args) {
	int[] a={51,4,66,7,78,122};
	for(int i=0;i<a.length;i++){
	int sum=0;
	int n=a[i];
	
		while(n>0){
	int	r=n%10;
		n=n/10;
		sum=sum+r;
	}
	System.out.println(sum);	
	}
}
}