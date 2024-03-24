package DivisionOfCode;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Demo.Person;


public class AAA {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = BBB.giveConnection();
		Statement statement = BBB.giveStatement(connection);
		String sql=BBB.SQLStmt();
		//	ResultSet resultset =statement.executeQuery(sql);
		ResultSet resultset = BBB.giveResultSet(sql,statement);

		//	while(resultset.next()){
		//		String sid=resultset.getString(1);
		//		String sname=resultset.getString(2);
		//		System.out.println(sid+ " "+ sname);

				ArrayList<Person> aa = BBB.iterateRs(resultset);
		System.out.println(aa);
	}
}
