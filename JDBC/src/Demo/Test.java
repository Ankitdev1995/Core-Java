package Demo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Connection;

public class Test {
public static void main(String[] args) {
	Statement stmt=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		stmt=con.createStatement();
		String sql="SELECT *FROM employee";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()){
			int id=rs.getInt("Eid");
			String first=rs.getString("Ename");
			int sal =rs.getInt("salary");
			
			System.out.println("ID is : "+id);
			System.out.println("Name is: "+first);
			System.out.println("Salary is: "+sal);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
