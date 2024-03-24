package chapter1;
/// 1 4 27 16 125 36 343 64 729 100 
public class testCla {
public static void main(String[] args) {
	int p; 
	int q;
	for(int i=1;i<=10;i++){
		if(i%2!=0){
			p=i*i*i;
			System.out.print(p+" ");
		// p=i*i*i;
		}
		else{
			q=i*i;
			System.out.print(q +" ");
		}
	}
}
}



