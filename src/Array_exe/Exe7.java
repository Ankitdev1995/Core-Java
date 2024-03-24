package Array_exe;
// only even number and even index element
public class Exe7 {
public static void main(String[] args) {
	int a[]={11,22,30,90,100,40,46,50,56};
	for(int i=0;i<a.length;i++){
		if(i%2==0 && a[i]%2==0){
			System.out.println(a[i]);
		}
	}
}
}
