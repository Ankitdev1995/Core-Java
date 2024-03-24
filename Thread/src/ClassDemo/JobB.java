package ClassDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JobB extends Thread {
@Override
public void run(){
	try{
	FileInputStream fis=new FileInputStream("D:\\SixSense");
	FileOutputStream fos=new FileOutputStream("D:\\SixxSensee");
	
	int a=0;
	while((a=fis.read())!=-1){
		fos.write(a);
	}
	}catch(Exception e){
		e.printStackTrace();
	}
	fis.close();
	fos.close();
	}
}
