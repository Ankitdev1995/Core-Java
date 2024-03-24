package Array_2D;

public class Demo2 {
public static void main(String[] args) {
	int a[][]=new int[6][4];
	int cnt=1;
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[i].length;j++){	
			a[i][j]=cnt++;
			System.out.print(a[i][j]+" ");
		}
	System.out.println();
	}
}
}