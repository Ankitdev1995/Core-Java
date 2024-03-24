package class_work_13_5;
// 1 2 3 * * * 7 8 9 
// 1 2 3 * * * 7 8 9 
// 1 2 3 * * * 7 8 9 
public class Demo1 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++ ){
		for(int j=1; j<=9;j++){
			if(j==1 || j==2 || j==3){
			System.out.print(j+" ");
			}
			if(j==4 || j==5 || j==6){
			System.out.print("*" + " ");
	     	}
			if(j==7 || j==8 || j==9){
			System.out.print(j+" ");
	        }
	    	}
			System.out.println();

}
}
}