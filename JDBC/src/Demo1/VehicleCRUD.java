package Demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class VehicleCRUD {
	public static void main(String[] args) throws Exception{


		Class.forName("com.mysql.jdbc.Driver");
		Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/learn", "root", "root");
		Scanner sc=new Scanner(System.in);

		System.out.println("CRUD OPERATION JDBC");
		System.out.println("1. INSERT");
		System.out.println("2. UPDATE");
		System.out.println("3. DELETE");
		System.out.println("4. DISPLAY");
		System.out.println("Enter your choice");
		int choice =sc.nextInt();

		switch (choice){
		case 1:
			System.out.println("1.Enter data");

			String query ="insert into vehicle values(405098,'Jaguar','Petrol','Rashmi ',9000000)";
			Statement st=cn.createStatement();
			st.executeUpdate(query);
			break;

		case 2:
			System.out.println("2.Update code...");
			String query2 = "update vehicle set FuelType='Disel' where RegId=405089";

			Statement st1=cn.createStatement();
			st1.executeUpdate(query2);
			break;

		case 3:
			System.out.println("3.Delete code...");
			String query3="delete from vehicle where Regid=1022"; 
			Statement st2 =cn.createStatement();
			st2.executeUpdate(query3);
			break;

		case 4:
			System.out.println("4.Display code...");

			String query4="select* from vehicle";
			Statement st3=cn.createStatement();	
			ResultSet rs1 =st3.executeQuery(query4);
			while(rs1.next()){
				System.out.println(rs1.getInt(1)+" "+rs1.getString(2));
			}
			break;
		}
	}
}

