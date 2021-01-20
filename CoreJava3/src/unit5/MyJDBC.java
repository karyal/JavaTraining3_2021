package unit5;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyJDBC {
	
	public void connect() {
		//Step-1 - Gather info
		String driver="com.mysql.cj.jdbc.Driver";
		String dbserver="127.0.0.1";//current machine | localhost
		int port=3306;
		String dbname="java3";		
		String url ="jdbc:mysql://"+dbserver+":"+port+"/"+dbname;		
		String user="root";
		String password="";
		
		try {
			//Step2 - Load Library i.e. Driver
			Class.forName(driver);
			
			//Step-3
			Connection conn = DriverManager.getConnection(url, user, password);
			conn.close();
			System.out.println("Connect database server successfully");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	//Task-1 (DDL)- Workbench
		// Data Types in MySQL (Common Types)
		// Primary Key, Unique Key, Foreign Key
		// Database Constraints (Null, Not Null, Check)
		// Create table 
		// Alter table
		// Drop table
	
	//Task-2 - (DML)
		//Insert, Update, Select, Delete Record
		// List all tables
}