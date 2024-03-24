package Class_Work_14_6;
//Print size of each element
public class Index_Size {
	
public static void main(String[] args) {
	
	int a[]={71,8565,117,4345665,93,8};
	
	for(int i=0;i<a.length;i++){
		
		int n = a[i];
		int cnt = 0;
		while(n>0){
			int r = n%10;
			n = n/10;
			cnt++;
		}
	System.out.print(cnt + " ");	
	}
}
}
