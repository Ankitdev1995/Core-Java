package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DESerialization {
public static void main(String[] args) {
	try{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
		Employee emp=(Employee)in.readObject();
		System.out.println(emp.empname+" "+emp.empsal+" "+emp.empno);
		in.close();
	}catch(Exception e){
		System.out.println(e);
	}
}
}
