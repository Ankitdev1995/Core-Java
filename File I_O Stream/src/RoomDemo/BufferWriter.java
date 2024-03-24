package RoomDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException; 

public class BufferWriter {
public static void main(String[] args) throws IOException{
	FileWriter fw=new FileWriter("abcd.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(100);
	bw.newLine();
	char[]ch={'a','b','c','d'};
	bw.write(ch);
	bw.newLine();
	bw.write("durga");
	bw.newLine();
	bw.write("Software Solution");
	bw.flush();
	bw.close();
	}
}
