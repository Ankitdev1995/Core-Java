package Demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class TestReader {
public static void main(String[] args) throws IOException, ClassNotFoundException  {
FileInputStream fis=new FileInputStream("target.txt");
		
	ObjectInputStream ois=new ObjectInputStream(fis);
		
	Object obj =(Object)ois.readObject();
	
	ArrayList<Student> stulist=(ArrayList<Student>)obj;

	stulist.forEach(s->System.out.println(s));
	}
}