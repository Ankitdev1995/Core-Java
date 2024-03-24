package IO_StreamFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Update {
	public static void main(String[] args) {
		BufferedReader reader =null;
		String OldContent ="";
		File file=new File("D:\\success.txt");
		try{
			String Content;
			FileReader fileReader=new FileReader(file);
			reader=new BufferedReader(fileReader);

			while((Content=reader.readLine())!=null){
				OldContent=OldContent.concat(Content).concat("\n");
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(reader!=null)
					reader.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
		System.out.println("Your Old Content:\n"+OldContent);
		System.out.println("Do You Need to update your content ? Y/N \n ");
		reader=new BufferedReader(new InputStreamReader(System.in));
		char c='y';
		try{
			c=(char)reader.read();
		}catch(IOException e1){
		}
		switch(c){
		case 'y':
			write(file);
			break;
		case 'n':
			break;
		case 'Y':
			write(file);
			break;
		case 'N':
			break;
		default:
			System.out.println("Press 'Y' or 'N' to continue..");
		}
	}
	private static void write(File file){
		try{
			String content =null;
			String NewContent ="";
			if(!file.exists()){
				file.createNewFile();
			}
			FileWriter fw=new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw=new BufferedWriter(fw);
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("end to quit and save your content..\n");
			do{
				try{
					content=(String)reader.readLine();
				}catch(IOException e){
				}
				NewContent =NewContent.concat(content).concat("\n");
			}while(!content.equals("end"));
			bw.write(NewContent);
			bw.close();
			System.out.println("\n Our content is successfully updated into \n");
			System.out.println(file);
		}catch(IOException e){
			e.printStackTrace();
		}

	}
}

