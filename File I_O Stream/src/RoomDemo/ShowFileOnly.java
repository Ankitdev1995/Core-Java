package RoomDemo;

import java.io.File;
//Code to display only file name
public class ShowFileOnly {
public static void main(String[] args) {
	int Counter=0;
	File f=new File("D:\\Classes");
	String[]s=f.list();
	for(String s1:s){
		File f1=new File(f,s1);
		
		if(f1.isFile()){
			Counter++;
			System.out.println(s1);
		}
	}		
	System.out.println(Counter);
	}
}
