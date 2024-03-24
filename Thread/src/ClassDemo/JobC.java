package ClassDemo;

public class JobC extends Thread{
	@Override
	public void run(){
		String st="Hello EveryOne";
		for(int i=0;i<=st.length();i++){
		System.out.println((char)i);
	}
	}
}
