package Demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateData {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("1.Driver load");
	
	Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/room_Pract1", "root", "root");
	System.out.println("Connection done");
	
	String query = "update employee2 set Ename='Prerna' where Eid=30";
	
	Statement st=cn.createStatement();
	st.executeUpdate(query);
	System.out.println("Query updated");
}
}