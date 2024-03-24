package class_work_14_5;
// # * # * # 
// * * * * * 
// # * # * # 
// * * * * * 
// # * # * # 

public class Demo4 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			
		for(int j=1;j<=5;j++){
			if(j==2 || j==4 || i==2 || i==4){
			
			System.out.print("*");
			}
			else {
			System.out.print("#");
				}
		}
		System.out.println();
		}
		
	System.out.println("==========");
	System.out.println("==========");
	
   // ***By using different logic*** \\
	////
	////
	////
     for(int i=1;i<=5; i++){
     
     for(int j=1;j<=5; j++){
    	 if(i%2==0 || j%2==0){
    		 System.out.print("*");
    	 }
    	 else{
     System.out.print("#");
     }

     }
     System.out.println();
     }
     
	}
     }