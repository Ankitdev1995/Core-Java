package Room;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepSte {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/room_pract1", "root", "root");
			String q="insert into employee2( Ename,Ecity,Ecourse,Esport)values(?,?,?,?)";

			PreparedStatement pstmt = cn.prepareStatement(q);
			pstmt.setString(1, "pritam");
			pstmt.setString(2, "amravti");
			pstmt.setString(3, "BE");
			pstmt.setString(4, "yoga");
			
			pstmt.executeUpdate();
			
			System.out.println("inserted");
			cn.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
