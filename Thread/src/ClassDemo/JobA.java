package ClassDemo;

public class JobA extends Thread{
@Override 
public void run(){
	int sum=0;
	for(int i=1;i<=500;i++){
		sum=sum+i;
				System.out.println(sum);
	}
}
}
