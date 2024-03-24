package RoomDemo;

import java.io.File;
// To display names of all files and directories in (D:\Exam form)
public class ShowFileFolder {
public static void main(String[] args) throws Exception{
	int count=0;
	File f=new File("D:\\Exam form");
	String []s=f.list();
	for(String s1:s)
	{
		count++;
		System.out.println(s1);
		}
	System.out.println("===================");
	System.out.println("The total number:"+count);
}
}
