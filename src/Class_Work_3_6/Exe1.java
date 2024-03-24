package Class_Work_3_6;
/* # # # # 
   # # # #
   # # # #
   * * * * 
   * * * * 
   * * * * 
   @ @ @ @
   @ @ @ @
   @ @ @ @		*/
public class Exe1 {
	public static void main(String[] args) {

		for(int i=1;i<=9;i++){
			for(int j=1;j<=4;j++){

				if(i==1||i==2|| i==3){
					System.out.print("#"+" ");	
				}

				if((i==4||i==5|| i==6)){
					System.out.print("*"+ " ");	
				}

				if(i==7||i==8|| i==9){
					System.out.print("@"+ " ");	
				}							
			}
			System.out.println();
		}
		System.out.println("=================");
		System.out.println("=================");

		for(int i=1;i<=9;i++){
			for(int j=1;j<=4;j++) {

				if((i>=1 && i<=3)&&(j>=1 && j<=4)){
					System.out.print("#"+ " ");
				}
				if((i>=4 && i<=6)&&(j>=1 && j<=4)){
					System.out.print("*"+" ");
				}
				if((i>=7 && i<=9)&&(j>=1 && j<=4)){
					System.out.print("@"+" ");
				}
			}
			System.out.println();
		}
	}
}
