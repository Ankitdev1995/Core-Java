package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class database {
public static void main(String[] args) throws ClassNotFoundException,SQLException{
	//Driver d=new Driver();
	
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("1.Driver loads");
	
	Connection cn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ankitDB","root","root");
	System.out.println("2.Connection done");
	int id=23;
	String name="JDBC";
	String query="Insert into student (id,name)";
	cn.createStatement();
	System.out.println("3.done");	
}
}
