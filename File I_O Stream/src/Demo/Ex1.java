package Demo;

import java.io.File;
import java.io.IOException;

public class Ex1 {
public static void main(String[] args) throws IOException {
	File f=new File("Demo.txt");
	f.createNewFile();
	System.out.println(f.createNewFile());
	
}
}
