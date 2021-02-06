package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MyDatabase {

	public void connectDb() {
		//Step-1
		//Pre-requirements
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";//localhost
		int port = 3306;
		String db_name="java1";
		String db_user="admin";
		String user_pass="admin@123";

		try {
			//Step-2
			//Load Driver
			System.out.println("Connecting.......");
			Class.forName(driver);
			//Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java1?", "admin", "admin@123");
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);
			System.out.println("Connected......");
			conn.close();
			System.out.println("Close Connection");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}

	public boolean login(String user, String pass) {
		boolean result = false;
		//Step-1
		//Pre-requirements
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java1";
		String db_user="admin";
		String user_pass="admin@123";
		//SQL Statement - Select		
		String str_sql = "SELECT * FROM users where user=? and pass=?";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);			
			//Select Record			
			PreparedStatement pstat = conn.prepareStatement(str_sql);						
			pstat .setString(1, user);			
			pstat .setString(2, pass);			
			ResultSet rs =pstat.executeQuery();
			int count = 0; 
			while(rs.next()) {
				count ++;															
			}
			if (count>0) {
				result = true;
			}
			pstat.close();
			conn.close();
		}
		catch(Exception ex) {
			result = false;
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}
	
	public boolean insert() {
		boolean result=false;
		//Step-1
		//Pre-requirements
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java1";
		String db_user="admin";
		String user_pass="admin@123";

		//SQL Statement
		String str_sql = "INSERT INTO contacts VALUES(107, 'kRISHNA','NEP','krishna@gmail.com','9843212345')";

		try {
			//Step-2
			//Load Driver
			System.out.println("Connecting.......");
			Class.forName(driver);
			//Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java1?", "admin", "admin@123");
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);
			System.out.println("Connected......");

			//Insert Record
			System.out.println("Inserting.....");
			Statement stat = conn.createStatement();
			stat.executeUpdate(str_sql); //executeUpdate-> Insert, Update, Delete Record
			stat.close();
			System.out.println("Inserted.....");
			conn.close();
			System.out.println("Close Connection");
			result=true;
		}
		catch(Exception ex) {
			result=false;
			System.out.println("Error : "+ex.getMessage());			
		}
		return result;
	}

	public boolean insert(int sn, String name, String address, String email, String phone) {
		boolean result = false;
		//Step-1
		//Pre-requirements
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java1";
		String db_user="admin";
		String user_pass="admin@123";

		//SQL Statement
		//String str_sql = "INSERT INTO contacts VALUES(107, 'kRISHNA','NEP','krishna@gmail.com','9843212345')";
		String str_sql = "INSERT INTO contacts VALUES("+sn+", '"+name+"','"+address+"','"+email+"','"+phone+"')";

		try {
			//Step-2
			//Load Driver
			System.out.println("Connecting.......");
			Class.forName(driver);
			//Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java1?", "admin", "admin@123");
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);
			System.out.println("Connected......");

			//Insert Record
			System.out.println("Inserting.....");
			Statement stat = conn.createStatement();
			stat.executeUpdate(str_sql); //executeUpdate-> Insert, Update, Delete Record
			stat.close();
			System.out.println("Inserted.....");
			conn.close();
			System.out.println("Close Connection");
			result = true;
		}
		catch(Exception ex) {
			result =false;
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}

	public boolean insert(Contact contact) {		
		boolean result=false;
		//Step-1
		//Pre-requirements
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java1";
		String db_user="admin";
		String user_pass="admin@123";

		//SQL Statement
		//String str_sql = "INSERT INTO contacts VALUES(107, 'kRISHNA','NEP','krishna@gmail.com','9843212345')";
		String str_sql = "INSERT INTO contacts(sn, name, address, email, phone) VALUES(?, ?, ?, ?, ?)";

		try {
			//Step-2
			//Load Driver
			System.out.println("Connecting.......");
			Class.forName(driver);
			//Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java1?", "admin", "admin@123");
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);
			System.out.println("Connected......");

			//Insert Record
			System.out.println("Inserting.....");
			//Statement stat = conn.createStatement();
			PreparedStatement pstat = conn.prepareStatement(str_sql);
			pstat.setInt(1, contact.getSn());
			pstat.setString(2, contact.getName());
			pstat.setString(3, contact.getAddress());
			pstat.setString(4, contact.getEmail());
			pstat.setString(5, contact.getPhone());

			pstat.executeUpdate(); //executeUpdate-> Insert, Update, Delete Record
			pstat.close();
			System.out.println("Inserted.....");
			conn.close();
			System.out.println("Close Connection");
			result=true;
		}
		catch(Exception ex) {
			result=false;
			System.out.println("Error : "+ex.getMessage());			
		}
		return result;
	}

	public void display_all() {
		//Step-1
		//Pre-requirements
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java1";
		String db_user="admin";
		String user_pass="admin@123";

		//SQL Statement - Select
		String str_sql = "SELECT * FROM contacts ORDER BY sn ASC LIMIT 1000";

		try {
			//Step-2
			//Load Driver
			//System.out.println("Connecting.......");
			Class.forName(driver);
			//Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java1?", "admin", "admin@123");
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);
			//System.out.println("Connected......");

			//Select Record
			//System.out.println("Selecting.....");
			Statement stat = conn.createStatement();						

			ResultSet rs = stat.executeQuery(str_sql); //executeQuery-> Select 

			System.out.println("SN\tNAME\tADDRESS\tEMAIL\t\t\tPHONE");
			while(rs.next()) {
				System.out.println(rs.getInt("sn")+"\t"+rs.getString("name")+"\t"+rs.getString("address")+"\t"+rs.getString("email")+"\t\t"+rs.getString("phone"));
			}

			stat.close();
			//System.out.println("Selected.....");
			conn.close();
			//System.out.println("Close Connection");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public List get_all() {		
		List contacts = new ArrayList();
		
		//Step-1
		//Pre-requirements
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java1";
		String db_user="admin";
		String user_pass="admin@123";
		
		//SQL Statement - Select
		String str_sql = "SELECT * FROM contacts ORDER BY sn ASC";
		
		try {
			//Step-2
			//Load Driver
			Class.forName(driver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);
			//Select Record
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(str_sql);			
			while(rs.next()) {
				Contact tmp = new Contact();
				tmp.setSn(rs.getInt("sn"));
				tmp.setName(rs.getString("name"));
				tmp.setAddress(rs.getString("address"));
				tmp.setEmail(rs.getString("email"));
				tmp.setPhone(rs.getString("phone"));
				contacts.add(tmp);
			}
			stat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return contacts;
				
	}
	
	public Contact search(int sn) {
		//Step-1
		//Pre-requirements
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java1";
		String db_user="admin";
		String user_pass="admin@123";

		Contact contact = new Contact();
		//SQL Statement - Select		
		String str_sql = "SELECT * FROM contacts where sn=?";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);			
			//Select Record			
			PreparedStatement pstat = conn.prepareStatement(str_sql);						
			pstat .setInt(1, sn);			
			ResultSet rs =pstat .executeQuery(); 								
			while(rs.next()) {
				contact = new Contact(rs.getInt("sn"), rs.getString("name"), rs.getString("address"), rs.getString("email"), rs.getString("phone"));				
				/*
				System.out.println("SN : "+rs.getInt("sn"));				
				System.out.println("NAME : "+rs.getString("name"));
				System.out.println("ADDRESS: "+rs.getString("address"));
				System.out.println("EMAIL: "+rs.getString("email"));
				System.out.println("PHONE: "+rs.getString("phone"));
				*/				
			}
			pstat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return contact;
	}

	public List searchV2(String search_term) {		
		List contacts = new ArrayList();
		
		//Step-1
		//Pre-requirements
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java1";
		String db_user="admin";
		String user_pass="admin@123";
		
		//SQL Statement - Select
		String str_sql = "SELECT * FROM contacts WHERE name LIKE '%"+search_term+"%' or address LIKE '%"+search_term+"%' ORDER BY sn ASC";
		
		try {
			//Step-2
			//Load Driver
			Class.forName(driver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);
			//Select Record
			PreparedStatement pstat = conn.prepareStatement(str_sql);
			//pstat.setString(1, '%'+search_term+'%');
			
			ResultSet rs = pstat.executeQuery(str_sql);			
			while(rs.next()) {
				Contact tmp = new Contact();
				tmp.setSn(rs.getInt("sn"));
				tmp.setName(rs.getString("name"));
				tmp.setAddress(rs.getString("address"));
				tmp.setEmail(rs.getString("email"));
				tmp.setPhone(rs.getString("phone"));
				contacts.add(tmp);
			}
			pstat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return contacts;
				
	}
	
	public boolean update(Contact contact) {
		boolean result=false;
		//Step-1
		//Pre-requirements
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java1";
		String db_user="admin";
		String user_pass="admin@123";

		//SQL Statement
		String str_sql = "UPDATE contacts SET name = ?, address=?, email=?, phone =? where sn =?";
		try {
			System.out.println("Connecting.......");
			Class.forName(driver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);

			PreparedStatement pstat = conn.prepareStatement(str_sql);			
			pstat.setString(1, contact.getName());
			pstat.setString(2, contact.getAddress());
			pstat.setString(3, contact.getEmail());
			pstat.setString(4, contact.getPhone());
			pstat.setInt(5, contact.getSn());
			pstat.executeUpdate(); //executeUpdate-> Insert, Update, Delete Record
			pstat.close();			
			conn.close();			
			result=true;
		}
		catch(Exception ex) {
			result=false;
			System.out.println("Error : "+ex.getMessage());			
		}
		return result;
	}

	public boolean delete(int sn) {
		boolean result=false;
		//Step-1
		//Pre-requirements
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java1";
		String db_user="admin";
		String user_pass="admin@123";

		//SQL Statement
		String str_sql = "DELETE from contacts where sn =?";
		try {		
			Class.forName(driver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);

			PreparedStatement pstat = conn.prepareStatement(str_sql);			
			pstat.setInt(1, sn);
			pstat.executeUpdate(); //executeUpdate-> Insert, Update, Delete Record
			pstat.close();			
			conn.close();			
			result=true;
		}
		catch(Exception ex) {
			result=false;
			System.out.println("Error : "+ex.getMessage());			
		}
		return result;
	}
}