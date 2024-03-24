package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class RoomPract {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/room_Pract1","root", "root");
	Statement st=con.createStatement();
	String query="create table Employee(Eid int,Ename varchar(20),Eadd varchar(50),Esal float(10),Doj DATE)";

	st.executeUpdate("insert into Employee values(35,'pranay','jalna',61000,'2022/03/07')");
	System.out.println("Table is created");
	st.close();
	con.close();
}
}
