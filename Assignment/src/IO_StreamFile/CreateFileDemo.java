package IO_StreamFile;

import java.io.File;
import java.io.IOException;

//Create a file in java
public class CreateFileDemo {
public static void main(String[] args) {
	try{
		File file=new File("d:\\newfile.txt");
		boolean fvar=file.createNewFile();
		if(fvar){
			System.out.println("File has been Created sucessfully");
		}else{
			System.out.println("File already present at the specified location");
		}
		}catch(IOException e){
			System.out.println("Exception Occured:");
			e.printStackTrace();
	}
}
}
