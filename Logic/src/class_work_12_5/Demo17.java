package class_work_12_5;
// *#*#
// *#*#
// *#*#
// *#*#
public class Demo17 {
	public static void main(String[] args) {
		for(int j=1; j<=4; j++){
			for(int i=1; i<=4; i++){
				if(i==1 || i==3){
					System.out.print("*");
				}
				if(i==2 || i==4){
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}