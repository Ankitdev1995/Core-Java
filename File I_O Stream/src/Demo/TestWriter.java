package Demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestWriter {
public static void main(String[] args) throws IOException{
	FileOutputStream fos=new FileOutputStream("pqr.txt");
	String s="Good Morning ";
	byte data[]=s.getBytes();
	fos.write(data);
	fos.close();
	System.out.println("Data is written on the disk");
}
}
