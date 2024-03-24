package Demo1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestWriter {
public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("xyz.txt");
	fos.write('H');
	fos.write('E');
	fos.write('L');
	fos.write('L');
	fos.write('O');
	
	fos.close();
	System.out.println("Data is written on the disk");
}
}
