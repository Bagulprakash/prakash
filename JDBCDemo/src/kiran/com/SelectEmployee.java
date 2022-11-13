package kiran.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//loading a class into a memory
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prakash ","root","prakashigr");
		
		String sql="select * from employee";
		String sql2="select * from student";
		Statement stmt=con.createStatement();
		
		System.err.println("Employee INfo");
		System.out.println();
		ResultSet rs=stmt.executeQuery(sql);
	
		
		while(rs.next()) { 
			String eId=rs.getString(1);
			String ename=rs.getString(2);
			String ecity=rs.getString(3);
			
			System.out.println("Id>>"+eId);
			System.out.println("Name>>"+ename);
			System.out.println("City>>"+ecity);
			System.out.println();
	
		}
		System.err.println("Student Info");
		System.out.println("-----------------");
ResultSet rs2=stmt.executeQuery(sql2);
		
		
		while(rs2.next()) { 
			String Id=rs2.getString(1);
			String name=rs2.getString(2);
			String city=rs2.getString(3);
			String country=rs2.getString(4);
			
			System.out.println("Id>>"+Id);
			System.out.println("Name>>"+name);
			System.out.println("City>>"+city);
			System.out.println("Country>>"+country);
			System.out.println();

		
	}
	}
}
