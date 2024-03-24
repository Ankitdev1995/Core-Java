package Thread;

public class Multithread {
	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<8;i++){

			MultithreadingDemo obj=new MultithreadingDemo ();
			obj.start();
		}
	}
}
