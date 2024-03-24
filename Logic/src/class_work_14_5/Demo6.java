package class_work_14_5;
// # # * * *
// # # * * *
// # # * * *
// * * # # #
// * * # # #
public class Demo6 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++){ // horizontal 
		
	for(int j=1; j<=5; j++){ // Vertical 
		if (
			(i>=1 && i<=3) && (j>=3 && j<=5)
					   ||
			(i>=4 && i<=5) && (j>=1 && j<=2)
		)
		{
		System.out.print(" * ");
	    }
		else
		{
		System.out.print(" # ");
		}
		
	    }
		System.out.println();
}
}
}
