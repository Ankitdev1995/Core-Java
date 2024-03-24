package Demo;

import java.io.File;
import java.io.IOException;
/* 	 code to create a directory named with 
  	durga123 in current working 
  	directory and create a file 
  	named with abc.txt in that directory */
 
public class Ex2 {
public static void main(String[] args) throws IOException {
	File f=new File("Durga123");
	f.mkdir();
//	File f1=new File("Durga123","qwe.txt");
	File f1=new File(f,"qwe.txt");
	f1.createNewFile();
	System.out.println(f1.createNewFile());
}
}
