package class_work_13_5;
/*   input - 8 2 7 6
  
     output -  7
   			   8
			   3
			   9       */
public class Demo13 {
	public static void main(String[] args) {
		int no=8276;
		int r;
		for(no=8276;no>0;no=no/10){
			r=no%10;
			r=r+1;
			System.out.println(r);
			
		}
		System.out.println();
	}
}