package Class_Work_14_6;
//Reverse of each digit
public class RevDigit {
	
public static void main(String[] args) {
	
	int a[]={17,58,711,54,39,8};
	
	for(int i=0;i<a.length;i++){
		int no=a[i];
	int sum=0;
	
	while(no>0){
	int r=no%10;
	no=no/10;
	sum=sum*10+r;
	}
	
	System.out.println(sum);
	}
}
}