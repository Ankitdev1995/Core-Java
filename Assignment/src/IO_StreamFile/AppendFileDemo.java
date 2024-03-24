package IO_StreamFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFileDemo {
public static void main(String[] args) {
	try{
		String content="This is my content which would be appened"+"at the end of the specified file";  
		File file=new File("C://myfile.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		FileWriter fw =new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(content);
		bw.close();
		System.out.println("Data suceesfully appended at the end of file");
	}catch(IOException ioe){
		System.out.println("Exception occured:");
		ioe.printStackTrace();
			
		}
	}
}

