package Class_Work_3_6;
/*   * * # * *
     # # # # #
     * * # * *
     # # # # #
     * * # * *		*/

public class Exe3 {
public static void main(String[] args) {
	
	for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
			
			if(j==3 || i==2 || i==4){
				System.out.print("#"+ " ");
			}
			else{
				System.out.print("*"+ " ");
			}
		}
	System.out.println();
	}
System.out.println("=======================");
for(int k=1; k<=5;k++) {
	
	for(int n=1;n<=5;n++) {
		
		if(n==3 || k==2 || k==4) {
			System.out.print("#"+" ");
		}
		else {
			System.out.print("@"+" ");
		}
	}
	System.out.println();
}


}
}
