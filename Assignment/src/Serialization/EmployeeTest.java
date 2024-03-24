package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {
	public static void main(String[] args) {
		try{
			Employee emp=new Employee();
			emp.setEmpSal(2000);
			emp.setEmpNo(20);
			emp.setEmpName("ankit");

			FileOutputStream fos =new FileOutputStream("f.txt");
			ObjectOutputStream out=new ObjectOutputStream(fos);
			out.writeObject(emp);
			out.flush();
			out.close();
			System.out.println("Success");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
