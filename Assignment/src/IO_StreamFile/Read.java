package IO_StreamFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
// Read Data from a file in java
public class Read {
public static void main(String[] args) {
	BufferedReader reader=null;
	try{
		String CurrentLine;
		File file=new File("/home/balaji/samplecodez/sucess.txt");
		FileReader fileReader=new FileReader(file);
		reader=new BufferedReader(fileReader);
		while((CurrentLine=reader.readLine())!=null){
			System.out.println(CurrentLine);
		}
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		try{
			if(reader!=null){
				reader.close();
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
}
}
