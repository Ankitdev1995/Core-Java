package class_work_12_5;
// input- 4179
// output-400
//		  100
//        700
//        900
public class Demo15 {
	public static void main(String[] args) {
		int n=4179;
		int rev=0;
		for(; n>0; n=n/10){
			int r=n%10;
			rev=(rev*10)+r;
		}
		System.out.println("reverse:"+ rev);
		 n=rev;
		 for(; n>0; n=n/10){
			 int r=n%10;
			 System.out.println(r*100);
		 }
				
	}

}
