package IO_StreamFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/*Program that reads the individual words from 
text file and prints them out, one per line.*/

public class ScanAndRead {
public static void main(String[] args) throws Exception {
	Scanner s=null;
	try{
		s=new Scanner(new BufferedReader(new FileReader("xanadu.txt")));
		while(s.hasNext()){
			System.out.println(s.next());
		}
		}finally{
			if(s!=null){
				s.close();
			}
		}
	
}
}