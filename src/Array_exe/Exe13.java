package Array_exe;

public class Exe13 {
public static void main(String[] args) {
	int a[]={11,22,33,44,55};
	int rev[]={55,44,33,22,11};
	
	for(int i=a.length-1,j=0;i>=0;i--,j++){
		rev[j]=a[i];
	}
	for(int i=0;i<rev.length;i++){
		System.out.println(rev[i]);
		}
}
}