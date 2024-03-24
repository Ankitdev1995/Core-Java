 
package Demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDMenu {
 public static void main(String[] args) throws Exception {
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/room_Pract1", "root", "root");
	Scanner sc=new Scanner(System.in);
	 
	 System.out.println("CRUD OPERATION JDBC");
	 System.out.println("1. INSERT");
	 System.out.println("2. UPDATE");
	 System.out.println("3. DELETE");
	 System.out.println("4. DISPLAY");
	 
	 System.out.println("Enter your choice");
	 int choice =sc.nextInt();
 
 switch (choice){
 case 1:
	 System.out.println("Enter Eid,Ename");
	 	int Eid=56;	
	 	String Ename="renu"; 
		String query ="insert into employee values(20,'sunny')";
		Statement st=cn.createStatement();
		st.executeUpdate(query);
 break;
  
 case 2:
	 System.out.println("2.Update code...");
	 String query2 = "update employee2 set Ename='Prerna' where Eid=30";
		
		Statement st1=cn.createStatement();
		st1.executeUpdate(query2);
	 break;
	 
 case 3:
	 System.out.println("3.Delete code...");
	 String query3="delete from employee2 where Eid=15"; 
		Statement st2 =cn.createStatement();
			st2.executeUpdate(query3);
	 break;
	 
 case 4:
	 System.out.println("4.Display code...");
	 String query4="select* from employee2";
		Statement st3=cn.createStatement();	
	ResultSet rs =st3.executeQuery(query4);
	while(rs.next()){
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	 break;
	}
}
}
}