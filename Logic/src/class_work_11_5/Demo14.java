package class_work_11_5;
// 1 10 100 1000 10000 1000 100 10 1
public class Demo14 {
public static void main(String[] args) {
	int k=1;
	for(int i=1;i<=9; i=i+1){
		
		System.out.print(k+ " ");
		
		if (i<=4)
		k=k*10;
		else 
		k=k/10;
	}
	}
}
