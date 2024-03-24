package Demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class DisplayData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/room_Pract1", "root","root");
	System.out.println("2. connection done...");

	String query="select* from employee2";
		Statement st=cn.createStatement();	
	ResultSet rs =st.executeQuery(query);
	while(rs.next()){
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	}
}
}