package IO_StreamFile;

import java.io.File;
//Create a directory in java
public class CreateDirectory {
	public static void main(String[] args) {
		try{
			String one = "e:jbk";
			String many = "e:hello/hi/say";
			File file=new File(one);
			if(!file.exists()){
				if(file.mkdir()){
					System.out.println("Directory:"+one +"created");
				}
			}
			File files=new File(many);
			if(!files.exists()){
				if(files.mkdir()){
					System.out.println("Directories:"+many+"created");
				}
			}
		}catch(Exception e){
			System.out.println("Error:"+e.getMessage());
		}
	}
}
