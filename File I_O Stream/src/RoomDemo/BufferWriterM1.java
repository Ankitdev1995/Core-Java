package RoomDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferWriterM1 {
public static void main(String[] args) throws IOException {
	PrintWriter pw=new PrintWriter("mno.txt");
	pw.println(222);
	pw.println(333);
	pw.println(444);
	pw.println(555);
	pw.flush();
	pw.close();
	
}
}
