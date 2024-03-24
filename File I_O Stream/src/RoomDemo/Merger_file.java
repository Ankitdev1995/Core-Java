package RoomDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Merger_file {
public static void main(String[] args) throws Exception {
	PrintWriter pw=new PrintWriter("file3.txt");
	BufferedReader br=new BufferedReader(new FileReader("mno.txt"));
	String line=br.readLine();
	while(line!=null){
		pw.println(line);
		line=br.readLine();
	}
	br=new BufferedReader(new FileReader("mpo.txt"));
	line =br.readLine();
	while(line!=null){
		pw.println(line);
		line =br.readLine();
	}
	pw.flush();
	br.close();
	pw.close();
	}
}
