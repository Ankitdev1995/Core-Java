package Pattern;
// 2,3  4,6  6,9  8,12  10,15
public class Demo10 {
	public static void main(String[] args) {
		int p=2;
		int q=3;
		for(int k=1; k<=5; k=k+1){
			System.out.print(" "+p+","+q+" ");
			p=p+2;
			q=q+3;
		}
		System.out.println("==================");
		
	// 3,4,5   6,8,10   9,12,15   12,16,20   15,20,25
		int c=3;
		int d=4;
		int e=5;
		for(int n=1; n<=8; n=n+1){
		System.out.print(" "+c +","+d +","+e +" ");
				c=c+3;
				d=d+4;
				e=e+5;
				}
	
	}
	

}
