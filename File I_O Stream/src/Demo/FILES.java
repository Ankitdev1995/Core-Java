package Demo;

import java.io.File;
import java.io.IOException;

public class FILES {
public static void main(String[] args) throws IOException {
	File f= new File("lkjh.txt");
	System.out.println(f.exists());
	f.createNewFile();
	System.out.println(f.exists());
}
}
