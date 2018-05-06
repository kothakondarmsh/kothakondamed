package com.techm.connectDb;
import java.sql.*;
public class DbConnect {
	
	public static Connection con = null;
	public static Connection createConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("driver found");
		
	String url = "jdbc:mysql://localhost:3306/medicaldb";
	String uid = "root";
	String pwd = "test";
	
	con = DriverManager.getConnection(url,uid,pwd);
		
		System.out.println("connected");
		return con;
	}

}
