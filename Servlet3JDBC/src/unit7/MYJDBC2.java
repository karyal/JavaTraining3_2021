package unit7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MYJDBC2 {

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
	public void insert_record(Person person) {
		//Step-1 - Gather info
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbserver = "localhost"; //current machine (or you can write "127.0.0.1" instead of "localhost")
		int port = 3306; 
		String dbname = "java1";
		String url = "jdbc:mysql://"+dbserver+":"+port+"/"+dbname;
		String user = "root";
		String password = "Prasamsa@1100"; 

		//String str_sql = "INSERT INTO contacts(full_name, contact_address) values('Ram Prasad Khanal','Nepal');";
		String str_sql = "INSERT INTO contacts(full_name, contact_address) values(?,?);";


		try {
			//Step2- Load Library i.e Driver
			Class.forName(driver);
			//Step-3
			Connection conn = DriverManager.getConnection(url,user,password);

			//Step-4
			//Statement stat = conn.createStatement();
			PreparedStatement pstat = conn.prepareStatement(str_sql);
			pstat.setString(1,  person.getFull_name());
			pstat.setString(2,  person.getContact_address());
			//stat.executeUpdate(str_sql);
			//stat.close();
			pstat.executeUpdate();
			pstat.close();

			conn.close();
			System.out.println("Insert record in table successfully.");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}

	public ArrayList select_records() {
		//Step-1 - Gather info
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbserver = "localhost"; //current machine (or you can write "127.0.0.1" instead of "localhost")
		int port = 3306; 
		String dbname = "java1";
		String url = "jdbc:mysql://"+dbserver+":"+port+"/"+dbname;
		String user = "root";
		String password = "Prasamsa@1100"; 

		String str_sql = "SELECT * FROM contacts;";

		ArrayList contacts =  new ArrayList();

		try {
			//Step2- Load Library i.e Driver
			Class.forName(driver);
			//Step-3
			Connection conn = DriverManager.getConnection(url,user,password);

			//Step-4
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(str_sql);//retrieving results from database
			//System.out.println("ID\tNAME\t\t\t\tADDRESS");					

			while(rs.next()) {
				//System.out.println(rs.getInt("id")+"\t"+ rs.getString("full_name")+ "\t\t"+ rs.getString("contact_address"));
				Person person = new Person();
				person.setId(rs.getInt("id"));
				person.setFull_name(rs.getString("full_name"));
				person.setContact_address(rs.getString("contact_address"));
				contacts.add(person);
			}

			stat.close();
			conn.close();
			//System.out.println("Display All Records successfully.");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return contacts;
	}

	public boolean delete_record(int id) {
		//Step-1 - Gather info
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbserver = "localhost"; //current machine (or you can write "127.0.0.1" instead of "localhost")
		int port = 3306; 
		String dbname = "java1";
		String url = "jdbc:mysql://"+dbserver+":"+port+"/"+dbname;
		String user = "root";
		String password = "Prasamsa@1100"; 

		String str_sql = "DELETE FROM contacts WHERE id = ?;";
		boolean result = false;
		try {
			//Step2- Load Library i.e Driver
			Class.forName(driver);
			//Step-3
			Connection conn = DriverManager.getConnection(url,user,password);

			//Step-4
			//Statement stat = conn.createStatement();

			PreparedStatement pstat = conn.prepareStatement(str_sql);
			//pstat.setString(1,person.getFull_name());
			//pstat.setString(2, person.getContact_address());
			pstat.setInt(1, id);

			//stat.executeUpdate(str_sql);
			//stat.close();

			pstat.executeUpdate();
			pstat.close();

			conn.close();
			System.out.println("Delete record successfully.");
			result = true;
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
			result = false;
		}
		return result;
	}

	public boolean update_record(Person person) {
		//Step-1 - Gather info
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbserver = "localhost"; //current machine (or you can write "127.0.0.1" instead of "localhost")
		int port = 3306; 
		String dbname = "java1";
		String url = "jdbc:mysql://"+dbserver+":"+port+"/"+dbname;
		String user = "root";
		String password = "Prasamsa@1100"; 

		String str_sql = "UPDATE contacts SET full_name = ?, contact_address = ? where id = ?;";
		boolean result = false;

		try {
			//Step2- Load Library i.e Driver
			Class.forName(driver);
			//Step-3
			Connection conn = DriverManager.getConnection(url,user,password);

			//Step-4
			//Statement stat = conn.createStatement();
			PreparedStatement pstat = conn.prepareStatement(str_sql);
			pstat.setString(1, person.getFull_name());
			pstat.setString(2, person.getContact_address());
			pstat.setInt(3, person.getId());
			//stat.executeUpdate(str_sql);
			//stat.close();

			pstat.executeUpdate();
			pstat.close();

			conn.close();
			System.out.println("Update record successfully.");
			result = true;
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
			result = false;
		}
		return result;
	}

	public Person search_record(int tmp_id) {
		//Step-1 - Gather info
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbserver = "localhost"; //current machine (or you can write "127.0.0.1" instead of "localhost")
		int port = 3306; 
		String dbname = "java1";
		String url = "jdbc:mysql://"+dbserver+":"+port+"/"+dbname;
		String user = "root";
		String password = "Prasamsa@1100"; 

		String str_sql = "select * from contacts where id = ?;";
		Person person = new Person();
		
		try {
			//Step2- Load Library i.e Driver
			Class.forName(driver);
			//Step-3
			Connection conn = DriverManager.getConnection(url,user,password);
			
			//Step-4
			//Statement stat = conn.createStatement();

			PreparedStatement pstat = conn.prepareStatement(str_sql);
			pstat.setInt(1, tmp_id);
			
			
			ResultSet rs = pstat.executeQuery();//getting records from database
			
			while(rs.next()) {
				//System.out.println(rs.getInt(1)+", "+rs.getString(2)+", "+rs.getString(3));
				person = new Person(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
			pstat.close();
			conn.close();
			System.out.println(person);
			return person;
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
			return person;
		}
	}
}
