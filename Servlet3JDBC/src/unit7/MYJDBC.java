package unit7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MYJDBC {

	public void connect() {
		//Step-1 - Gather info
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbserver = "localhost"; //current machine (or you can write "127.0.0.1" instead of "localhost")
		int port = 3306; 
		String dbname = "java1";
		String url = "jdbc:mysql://"+dbserver+":"+port+"/"+dbname;
		String user = "root";
		String password = "Prasamsa@1100"; 

		try {
			//Step2- Load Library i.e Driver
			Class.forName(driver);
			//Step-3
			Connection conn = DriverManager.getConnection(url,user,password);
			conn.close();
			System.out.println("Connect database server successfully.");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
			public void create_table() {
				//Step-1 - Gather info
				String driver = "com.mysql.cj.jdbc.Driver";
				String dbserver = "localhost"; //current machine (or you can write "127.0.0.1" instead of "localhost")
				int port = 3306; 
				String dbname = "java1";
				String url = "jdbc:mysql://"+dbserver+":"+port+"/"+dbname;
				String user = "root";
				String password = "Prasamsa@1100"; 
				
				String str_sql = "CREATE TABLE contacts(\r\n"
						+ "id int NOT NULL AUTO_INCREMENT PRIMARY KEY,\r\n"
						+ "full_name varchar(50),\r\n"
						+ "contact_address varchar(50)\r\n"
						+ ");";

				try {
					//Step2- Load Library i.e Driver
					Class.forName(driver);
					//Step-3
					Connection conn = DriverManager.getConnection(url,user,password);
					
					//Step-4
					Statement stat = conn.createStatement();
					stat.executeUpdate(str_sql);
					stat.close();
					
					conn.close();
					System.out.println("Create table successfully.");
				}
				catch(Exception ex) {
					System.out.println("Error : "+ex.getMessage());
				}
			}
			public void insert_record() {
				//Step-1 - Gather info
				String driver = "com.mysql.cj.jdbc.Driver";
				String dbserver = "localhost"; //current machine (or you can write "127.0.0.1" instead of "localhost")
				int port = 3306; 
				String dbname = "java1";
				String url = "jdbc:mysql://"+dbserver+":"+port+"/"+dbname;
				String user = "root";
				String password = "Prasamsa@1100"; 
				
				String str_sql = "INSERT INTO contacts(full_name, contact_address) values('Ram Prasad Khanal','Nepal');";

				try {
					//Step2- Load Library i.e Driver
					Class.forName(driver);
					//Step-3
					Connection conn = DriverManager.getConnection(url,user,password);
					
					//Step-4
					Statement stat = conn.createStatement();
					stat.executeUpdate(str_sql);
					stat.close();
					
					conn.close();
					System.out.println("Insert record in table successfully.");
				}
				catch(Exception ex) {
					System.out.println("Error : "+ex.getMessage());
				}
			}
			public void select_records() {
				//Step-1 - Gather info
				String driver = "com.mysql.cj.jdbc.Driver";
				String dbserver = "localhost"; //current machine (or you can write "127.0.0.1" instead of "localhost")
				int port = 3306; 
				String dbname = "java1";
				String url = "jdbc:mysql://"+dbserver+":"+port+"/"+dbname;
				String user = "root";
				String password = "Prasamsa@1100"; 
				
				String str_sql = "SELECT * FROM contacts;";

				try {
					//Step2- Load Library i.e Driver
					Class.forName(driver);
					//Step-3
					Connection conn = DriverManager.getConnection(url,user,password);
					
					//Step-4
					Statement stat = conn.createStatement();
					ResultSet rs = stat.executeQuery(str_sql);
					System.out.println("ID\tNAME\t\t\t\tADDRESS");
					
					while(rs.next()) {
						System.out.println(rs.getInt("id")+"\t"+ rs.getString("full_name")+ "\t\t"+ rs.getString("contact_address"));
					}
					stat.close();
					conn.close();
					System.out.println("Display All Records successfully.");
				}
				catch(Exception ex) {
					System.out.println("Error : "+ex.getMessage());
				}
			}
			public void delete_record() {
				//Step-1 - Gather info
				String driver = "com.mysql.cj.jdbc.Driver";
				String dbserver = "localhost"; //current machine (or you can write "127.0.0.1" instead of "localhost")
				int port = 3306; 
				String dbname = "java1";
				String url = "jdbc:mysql://"+dbserver+":"+port+"/"+dbname;
				String user = "root";
				String password = "Prasamsa@1100"; 
				
				String str_sql = "DELETE FROM contacts WHERE id = 2;";

				try {
					//Step2- Load Library i.e Driver
					Class.forName(driver);
					//Step-3
					Connection conn = DriverManager.getConnection(url,user,password);
					
					//Step-4
					Statement stat = conn.createStatement();
					stat.executeUpdate(str_sql);
					stat.close();
					
					conn.close();
					System.out.println("Delete record successfully.");
				}
				catch(Exception ex) {
					System.out.println("Error : "+ex.getMessage());
				}
			}
			
			public void update_record() {
				//Step-1 - Gather info
				String driver = "com.mysql.cj.jdbc.Driver";
				String dbserver = "localhost"; //current machine (or you can write "127.0.0.1" instead of "localhost")
				int port = 3306; 
				String dbname = "java1";
				String url = "jdbc:mysql://"+dbserver+":"+port+"/"+dbname;
				String user = "root";
				String password = "Prasamsa@1100"; 
				
				String str_sql = "UPDATE contacts SET full_name = 'Roshan Thapa', contact_address = 'India' where id = 4;";

				try {
					//Step2- Load Library i.e Driver
					Class.forName(driver);
					//Step-3
					Connection conn = DriverManager.getConnection(url,user,password);
					
					//Step-4
					Statement stat = conn.createStatement();
					stat.executeUpdate(str_sql);
					stat.close();
					
					conn.close();
					System.out.println("Update record successfully.");
				}
				catch(Exception ex) {
					System.out.println("Error : "+ex.getMessage());
				}
			}
			 
			public void search_records() {
				//Step-1 - Gather info
				String driver = "com.mysql.cj.jdbc.Driver";
				String dbserver = "localhost"; //current machine (or you can write "127.0.0.1" instead of "localhost")
				int port = 3306; 
				String dbname = "java1";
				String url = "jdbc:mysql://"+dbserver+":"+port+"/"+dbname;
				String user = "root";
				String password = "Prasamsa@1100"; 
				
				//String tmp = "Rajesh"; // user given value to search
				String str_sql = "SELECT * FROM contacts where full_name = 'Alex Lee';";

				try {
					//Step2- Load Library i.e Driver
					Class.forName(driver);
					//Step-3
					Connection conn = DriverManager.getConnection(url,user,password);
					
					//Step-4
					Statement stat = conn.createStatement();
					ResultSet rs = stat.executeQuery(str_sql);
					System.out.println("ID\tNAME\t\t\t\tADDRESS");
					
					while(rs.next()) {
						System.out.println(rs.getInt("id")+"\t"+ rs.getString("full_name")+ "\t\t"+ rs.getString("contact_address"));
					}
					stat.close();
					conn.close();
					System.out.println("Search & Display Record(s) successfully.");
				}
				catch(Exception ex) {
					System.out.println("Error : "+ex.getMessage());
				}
			}
	}
