package DeepakSir;

public class Demo3 extends Thread{
	@Override
	public void run() {
		System.out.println("Playing video");
	}
}
class Demo3a extends Thread{
	@Override
	public void run() {
		System.out.println("Playing music");
	}
}
class Demo3b extends Thread{
	@Override
	public void run() {
		System.out.println("Progress bar is Executing");
	}
}
class Demo3c extends Thread{
	@Override
	public void run() {
		System.out.println("Timer is executing");
	}
}
