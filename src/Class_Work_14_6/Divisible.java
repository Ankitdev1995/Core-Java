package Class_Work_14_6;

public class Divisible {
	
	public static void main(String[] args) {

		int a[] = {10,12,35,140,105,95,46,70,90,49};

		for(int i=0;i<a.length;i++){

			if(a[i]%5 == 0 && a[i]%7 == 0){

				System.out.println(a[i]);
			}
		}
		System.out.println("===============");

		int p[] = {10,60,90,40};
		for(int k=0; k<=p.length; k++) {
			
			if(p[k]%5 == 0) {
				
				System.out.println(p[k]);

			}
		}
	}
}