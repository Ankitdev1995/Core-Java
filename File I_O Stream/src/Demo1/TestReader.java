package Demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestReader {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("xyz.txt");
	//System.out.println("===Without loop===");

	/*int ch =fis.read();
	System.out.println((char)ch);

	 ch =fis.read();
	System.out.println((char)ch);

	 ch =fis.read();
	System.out.println((char)ch);

	 ch =fis.read();
	System.out.println((char)ch);
	
	 ch =fis.read();
	System.out.println((char)ch);*/
	
	System.out.println("===By using loop===");

	int ch;
	while((ch=fis.read())!=-1){
		
		System.out.println((char)ch);
	}
}
}
