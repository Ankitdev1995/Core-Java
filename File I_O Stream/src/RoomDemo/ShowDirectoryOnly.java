package RoomDemo;

import java.io.File;

// code to display only directory 
public class ShowDirectoryOnly {
	public static void main(String[] args) throws Exception {
		int count=0;
		File f=new File("D:\\English");
		String []s=f.list();
		for(String s1:s){

			File f1=new File(f,s1);
			if(f1.isDirectory()){
				count++;
				System.out.println(s1);

			}
		}
		System.out.println(count);

	}
}
