package Class_Work_1_6;
// print all elements at even index
public class Exe5 {
public static void main(String[] args) {
	int []a = {51,4,66,7,78,122};
	for(int i=0;i<a.length;i++){
	if( i%2==0){
		System.out.print(a[i]+" ");
	}
	System.out.println();
	}
}
}