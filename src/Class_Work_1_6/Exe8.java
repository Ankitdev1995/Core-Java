package Class_Work_1_6;
// print palindrome number in given array
public class Exe8 {
public static void main(String[] args) {
	int []a={51,4,66,7,78,122};
	for(int i=0;i<a.length;i++){
		int t=a[i],sum=0,r;
		while(a[i]>0){
			r=a[i]%10;
			a[i]=a[i]/10;
			sum=sum*10+r;
		}
		if(t==sum)
			System.out.println(t+" "+"is palindrome"+ " ");
		else
			System.out.println(t+" "+"is not palindrome"+ " ");
	}
}
}