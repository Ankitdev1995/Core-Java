package ClassDemo4;

public class X {
	int c=0;
	synchronized void increment(){
		c=c+1;
	}
	synchronized void decrement(){
		c=c-1;
	}
}
