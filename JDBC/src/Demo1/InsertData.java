package Demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("1.Driver loads....");
	
	Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/room_Pract1", "root", "root");
	System.out.println("2. connection done");
	
	int a=20;
	String s="Reshma";
	
	String query ="insert into employee2 values(99,'sandhya')";
	Statement st=cn.createStatement();
	st.executeUpdate(query);
	System.out.println("query inserted...");
}
}
