package Class_Work_3_6;
/*  **
    **
    ***
    ***
    ***
    ****
    ****
    ****
    ****
    *****
    *****
    *****
    *****
    *****    */
public class Exe2 {
public static void main(String[] args) {
	for(int i=1;i<=14;i++){
		for(int j=1;j<=5;j++){
			
			if((i>=1&&i<=2)&&(j>=3&&j<=5)){
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		
			 if((i>=3&&i<=5)&&(j>=4&&j<=5)){
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		/*	if((i>=6&&i<=9)&&(j==5)){
				System.out.print(" ");
			}
			else
				System.out.print("*");  */
			
		}		
		System.out.println();
	}
}
}
