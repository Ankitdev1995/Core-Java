package Array_exe;
//first even then odd
public class Exe6 {
public static void main(String[] args) {
	int a[]={11,22,33,44,55,64,88,94,07,23,48};
	for (int i=0;i<a.length;i++){
		if(a[i]%2==0){
			System.out.println(a[i]);
		}
	
	}
		for(int i=0;i<a.length;i++){
		if(a[i]%2!=0){
			System.out.println(a[i]);
		}
	}
	}

}
