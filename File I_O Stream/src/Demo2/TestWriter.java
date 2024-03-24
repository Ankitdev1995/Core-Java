package Demo2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestWriter {
public static void main(String[] args) throws IOException {
	Student s1=new Student(101,"Ram","India");
	Student s2=new Student(102,"cook","UK");
	Student s3=new Student(103,"vean","USA");
	Student s4=new Student(104,"sammaual","AUS");
	Student s5=new Student(105,"chin min cun","China");
	Student s6=new Student(106,"leoo","Nigeria");

	ArrayList<Student> al=new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	al.add(s3);	
	al.add(s4);
	al.add(s4);
	al.add(s6);
	
	FileOutputStream fos= new FileOutputStream("Target55.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);

	oos.writeObject(al);
	oos.close();
	fos.close(); 
	
	System.out.println("Data is written on the disk ");

}
}