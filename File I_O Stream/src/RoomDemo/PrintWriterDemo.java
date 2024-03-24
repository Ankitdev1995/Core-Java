package RoomDemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
public static void main(String[] args) throws FileNotFoundException {
	PrintWriter pw=new PrintWriter("pkl.txt");
	pw.write(100);
	pw.println(100);
	pw.println(true);
	pw.println('c');
	pw.println("durga");
	pw.flush();
	pw.close();
}
}
