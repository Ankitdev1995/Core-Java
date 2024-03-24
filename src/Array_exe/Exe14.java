package Array_exe;
// Swapping by an array
public class Exe14 {
public static void main(String[] args) {
	int []a={11,22,33,44,55,66,77};
	int n=a.length-1;
	
	for(int i=0;i<a.length/2;i++,n--){
		int t=a[i];
		a[i]=a[n];
		a[n]=t;
		}
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]+ " ");
	}
}
}
