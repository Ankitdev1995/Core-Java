package class_work_14_5;
// # # * * *
// # # * * *
// # # * * *
// # # # # #
// # # # # #

public class Demo5 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i>3 || j<3)
					System.out.print(" # ");
				else{
					System.out.print(" * ");
				}
			}
			System.out.println();

		}
		// By using different logic //
		System.out.println("================");
		System.out.println("================");

		for(int i=1;i<=5;i++){

			for(int j=1;j<=5;j++){
				if(i==4 || i==5 || j==1 || j==2 ){
					System.out.print(" # ");
				}
				else
				{
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}
}

