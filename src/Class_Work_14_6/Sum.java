package Class_Work_14_6;
// find sum of all elements in given array
public class Sum {
public static void main(String[] args) {
	
	int a[]={51,4,66,7,78,122};
	int sum = 0;
	for(int i=0;i<a.length;i++){
		sum = sum+a[i];
	}
	System.out.println("sum of element is=>>"+sum);
}
}
