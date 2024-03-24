package Demo;

import java.io.File;

public class DIRECTORIES {
public static void main(String[] args) {
	File f=new File("Ankit123");
	System.out.println(f.exists());
	f.mkdir();
	System.out.println(f.exists());
	}

}

