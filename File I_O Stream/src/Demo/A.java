package Demo;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter input stream");
		String input = sc.nextLine();
		
		System.out.println("Enter output Stream");
		String output = sc.nextLine();
		
		FileInputStream fis=new FileInputStream(input);
		FileOutputStream fos=new FileOutputStream(output);
		int a=0;
		while((a=fis.read())!=-1){
			fos.write(a);
		}
		System.out.println("File Copied Successfully");
		fis.close();
	}
}


