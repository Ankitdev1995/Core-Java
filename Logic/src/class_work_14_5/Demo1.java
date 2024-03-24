package class_work_14_5;
// * * * # #
// * * * # # 
// * * * * *
// * * * * *
// * * * * *

public class Demo1 {
	public static void main(String[] args) {
		for(int j=1; j<=5;j++){

			for(int i=1;i<=5;i++){
				if(i==1 ||i==2 || i==3 || j==3 || j==4 || j==5 ){
					System.out.print("*");
				}else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}