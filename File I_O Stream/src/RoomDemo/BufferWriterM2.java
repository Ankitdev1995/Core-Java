package RoomDemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class BufferWriterM2 {
public static void main(String[] args) throws FileNotFoundException {
	PrintWriter pw=new PrintWriter("mpo.txt");
	pw.println("AAA");
	pw.println("BBB");
	pw.println("CCC");
	pw.println("DDD");
	pw.flush();
	pw.close();
	
}
}
