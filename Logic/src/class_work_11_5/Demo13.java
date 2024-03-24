package class_work_11_5;
// 1 2 3 4 5 4 3 2 1
public class Demo13 {
public static void main(String[] args) {
	int k=1;
	for(int i=1; i<=9; i=i+1){
	System.out.print(k+ " ");
	if(i<=4)
		k++;
	else
		k--;
	}
	
}
}