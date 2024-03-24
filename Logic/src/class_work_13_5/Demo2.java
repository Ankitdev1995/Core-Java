package class_work_13_5;
//1 2 3 * * * 1 1 1 
//1 2 3 * @ * 1 2 1 
//1 2 3 * * * 1 1 1 
public class Demo2 {
public static void main(String[] args) {
	for(int i=1;i<=3;i++){
		for(int j=1;j<=9;j++){
		if(j==1 || j==2 || j==3){
			System.out.print(j+ " ");
			}
		if(j==4 || j==6){
			System.out.print('*'+" ");
		}
		if(j==5 && i==2){
			System.out.print('@'+" ");
		}
		
		if(j==8 && i==2){
			System.out.print('2'+ " ");
		}
		
		if(j==7 || j==9){
			System.out.print(1+" ");	
		}
		}
		System.out.println();
}
}
}