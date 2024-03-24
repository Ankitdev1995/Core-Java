package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Vehicle {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/learn","root", "root");
		Statement st=con.createStatement();

		String query="create table Vehicle (RegId int, Vehicle Name varchar(45),Fuel Type varchar(45),Owner Name varchar(45), Vechicle Price float(45))";
		st.executeUpdate("insert into Vehicle values(405012,'HondaCity','Petrol','sachin',600000 )");
		System.out.println("Table is Created");

		st.close();
		con.close();

	}
}