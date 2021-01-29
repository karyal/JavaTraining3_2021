package unit5_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJDBC2 {
	
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
	
	public void create_table() {
		//Step-1 - Gather info
		String driver="com.mysql.cj.jdbc.Driver";
		String dbserver="127.0.0.1";//current machine | localhost
		int port=3306;
		String dbname="java3";		
		String url ="jdbc:mysql://"+dbserver+":"+port+"/"+dbname;		
		String user="root";
		String password="";
		
		String str_sql ="CREATE TABLE contacts(\r\n"
				+ "	id int NOT NULL AUTO_INCREMENT PRIMARY KEY, \r\n"
				+ "    full_name varchar(50),\r\n"
				+ "    contact_address varchar(50)    \r\n"
				+ ");";
		
		try {
			//Step-2 Load Library i.e. Driver
			Class.forName(driver);
			
			//Step-3
			Connection conn = DriverManager.getConnection(url, user, password);
			
			//Step-4
			Statement stat = conn.createStatement();
			stat.executeUpdate(str_sql);
			stat.close();
			
			conn.close();
			System.out.println("Create table successfully");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
		
	//Task-2 - (DML)
		//Insert, Update, Select, Delete Record
		// List all tables
	
	public void insert_record(Person person) {
		//Step-1 - Gather info
		String driver="com.mysql.cj.jdbc.Driver";
		String dbserver="127.0.0.1";//current machine | localhost
		int port=3306;
		String dbname="java3";		
		String url ="jdbc:mysql://"+dbserver+":"+port+"/"+dbname;		
		String user="root";
		String password="";
		
		//String str_sql ="insert into contacts(full_name, contact_address) values('Raj Rai','NEP');";
		String str_sql ="insert into contacts(full_name, contact_address) values(?, ?);";
		
		try {
			//Step-2 Load Library i.e. Driver
			Class.forName(driver);
			
			//Step-3
			Connection conn = DriverManager.getConnection(url, user, password);
			
			//Step-4
			//Statement stat = conn.createStatement();
			
			PreparedStatement pstat = conn.prepareStatement(str_sql);
			pstat.setString(1, person.getFull_name());
			pstat.setString(2, person.getContact_address());
			
			//stat.executeUpdate(str_sql);
			//stat.close();
			
			pstat.executeUpdate(); //Save on Database Table (Insert, Update, Delete)
			pstat.close();
			
			conn.close();
			System.out.println("Insert Record Successfully!");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public void select_records() {
		//Step-1 - Gather info
		String driver="com.mysql.cj.jdbc.Driver";
		String dbserver="127.0.0.1";//current machine | localhost
		int port=3306;
		String dbname="java3";		
		String url ="jdbc:mysql://"+dbserver+":"+port+"/"+dbname;		
		String user="root";
		String password="";
		
		String str_sql ="select * from contacts;";
		
		try {
			//Step-2 Load Library i.e. Driver
			Class.forName(driver);
			
			//Step-3
			Connection conn = DriverManager.getConnection(url, user, password);
			
			//Step-4
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(str_sql);
			System.out.println("ID\tNAME\t\tADDRESS");
			
			while(rs.next()) {
				System.out.println(rs.getInt("id")+"\t"+ rs.getString("full_name") +"\t\t"+rs.getString("contact_address"));
			}
			
			stat.close();			
			conn.close();
			System.out.println("Display All Records Successfully!");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public void search_records() {
		//Step-1 - Gather info
		String driver="com.mysql.cj.jdbc.Driver";
		String dbserver="127.0.0.1";//current machine | localhost
		int port=3306;
		String dbname="java3";		
		String url ="jdbc:mysql://"+dbserver+":"+port+"/"+dbname;		
		String user="root";
		String password="";				
		
		String str_sql ="select * from contacts where full_name='Roshan Thapa';";
		
		try {
			//Step-2 Load Library i.e. Driver
			Class.forName(driver);
			
			//Step-3
			Connection conn = DriverManager.getConnection(url, user, password);
			
			//Step-4
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(str_sql);
			System.out.println("ID\tNAME\t\tADDRESS");
			
			while(rs.next()) {
				System.out.println(rs.getInt("id")+"\t"+ rs.getString("full_name") +"\t\t"+rs.getString("contact_address"));
			}
			
			stat.close();			
			conn.close();
			System.out.println("Search & Display Record(s) Successfully!");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public void delete_record() {
		//Step-1 - Gather info
		String driver="com.mysql.cj.jdbc.Driver";
		String dbserver="127.0.0.1";//current machine | localhost
		int port=3306;
		String dbname="java3";		
		String url ="jdbc:mysql://"+dbserver+":"+port+"/"+dbname;		
		String user="root";
		String password="";
		
		String str_sql ="delete from contacts where id=1;";
		
		try {
			//Step-2 Load Library i.e. Driver
			Class.forName(driver);
			
			//Step-3
			Connection conn = DriverManager.getConnection(url, user, password);
			
			//Step-4
			Statement stat = conn.createStatement();
			stat.executeUpdate(str_sql);
			stat.close();
			
			conn.close();
			System.out.println("Delete Record Successfully!");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public void update_record() {
		//Step-1 - Gather info
		String driver="com.mysql.cj.jdbc.Driver";
		String dbserver="127.0.0.1";//current machine | localhost
		int port=3306;
		String dbname="java3";		
		String url ="jdbc:mysql://"+dbserver+":"+port+"/"+dbname;		
		String user="root";
		String password="";
		
		String str_sql ="update contacts set full_name='Roshan Thapa', contact_address='IND' where id=2;";
		
		try {
			//Step-2 Load Library i.e. Driver
			Class.forName(driver);
			
			//Step-3
			Connection conn = DriverManager.getConnection(url, user, password);
			
			//Step-4
			Statement stat = conn.createStatement();
			stat.executeUpdate(str_sql);
			stat.close();
			
			conn.close();
			System.out.println("Update Record Successfully!");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}