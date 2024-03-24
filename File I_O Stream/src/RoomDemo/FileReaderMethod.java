package RoomDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMethod {
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("lkg.txt");
	int i=fr.read();
	while(i!=-1)
	{
		System.out.print((char)i);
		/*At the time of printing we 
		have to perform type casting(Char)*/
		i=fr.read();
	}
	fr.close();
}
}
