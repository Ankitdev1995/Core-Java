package Demo;

import java.io.File;
import java.io.IOException;

public class Ex3 {
public static void main(String[] args) throws IOException {
	File f=new File("E:\\New folder","Demo.txt");
	System.out.println(f.createNewFile());

}
}
