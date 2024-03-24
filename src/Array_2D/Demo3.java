package Array_2D;

public class Demo3 {
public static void main(String[] args) {
	int a[][]=new int [5][5];
	int c=1,sumA=0, sumB=0, sumC=0, sumD=0, sumE=0, sumF=0, sumG=0;
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[i].length;j++){
			a[i][j]=c++;
			System.out.print(a[i][j]+" ");
		
		if(i<=1 && j<=1)	// 1+2+6+7 = 16
			sumA=sumA+a[i][j];
		if(i<=1 && j>=3) // 4+5+9+10 = 28
			sumB=sumB+a[i][j];
		if(i>=3 && j>=3) // 19+20+24+25 = 88
			sumC=sumC+a[i][j];
		if(i>=3 && j<=1) // 16+17+21+22 = 76
			sumD=sumD+a[i][j];
		if(i==2||j==2)	// 11+12+13+14+15+3+8+18+23 = 117
			sumE=sumE+a[i][j];
		if(i==j) // 1+7+13+19+25 =65
			sumF=sumF+a[i][j];
		if(i==j)
			sumG=sumG+a[i][j];
		}
		System.out.println();
	}
	System.out.println("sumA:"+sumA);
	System.out.println("sumB:"+sumB);
	System.out.println("sumC:"+sumC);
	System.out.println("sumD:"+sumD);
	System.out.println("sumE:"+sumE);
	System.out.println("sumF:"+sumF);
	System.out.println("sumG:"+sumG);
}
}