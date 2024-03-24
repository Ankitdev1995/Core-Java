package Pattern;
// 5 10 Hello 15 20 Hello 25 30 Hello 
public class Demo13 {
	public static void main(String[] args) {
		for (int i=5; i<=30; i=i+5){
		System.out.print(i+ " ");
			if (i%10==0){
			System.out.print("Hello" + " ");
		}
		}
		}
}
