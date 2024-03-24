package class_work_13_5;
// $ @ $ @
// $ @ $ @ $ @ $ @ 
// $ @ $ @ $ @ $ @ $ @

public class Demo5 {
	public static void main(String[] args) {
		for(int i=4;i<=10;i=i+4){
		for(int j=1;j<=i;j++){
		if(j%2==0){
			System.out.print('@'+" " );
		}
		else{
			System.out.print("$"+ " ");
		}
		}
		System.out.println();
		}
		}
	}
