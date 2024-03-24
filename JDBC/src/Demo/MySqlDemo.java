package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlDemo {
public static void main(String[] args) throws Exception {
	//load the driver
	Class.forName("com.mysql.jdbc.Driver");
	//Established the connection between java application with MySQL database
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/room","root","root");
	
	//create statement object
	Statement st=con.createStatement();
	//write and Execute SQL query
	String query ="create table (Cid int,Cname CHAR(20),dob DATE,qualification CHAR(20),email CHAR(20),phonenumber VARCHAR(12))";
	st.executeUpdate("insert into Employee values (160,'roniibhai','2022-09-11','BE','Ronii23@gmail.com',399975)");

	System.out.println("Employee table Created Sucessfully");
	//close the connection
	st.close();
	con.close();
}
}
