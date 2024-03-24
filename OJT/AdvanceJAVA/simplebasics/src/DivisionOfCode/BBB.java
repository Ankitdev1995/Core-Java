package DivisionOfCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Demo.Person;

public class BBB { 
	public static ArrayList<Person> iterateRs(ResultSet resultset)throws SQLException{
		ArrayList<Person> arraylist=new ArrayList<Person>();
		while(resultset.next()){
			String sid= resultset.getString(1);
			String sname= resultset.getString(2);
			Person person = new Person(sid, sname);
			System.out.println(sid+ " "+ sname);
			arraylist.add(person);
		}
		return arraylist;

	}
	public static Connection giveConnection() throws Exception{
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/room", "root", "root");
		return connection;
	}	
	public static String SQLStmt(){
		String sql="select * from employee";
		return sql;
	}
	public static ResultSet giveResultSet(String strOfSql,Statement statement)throws SQLException{
		ResultSet resultset = statement.executeQuery(strOfSql);
		return resultset;
	}

	public static Statement giveStatement(Connection connection) throws SQLException{
		Statement statement = connection.createStatement();
		return statement;

	}
}

