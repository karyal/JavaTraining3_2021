package unit5_jdbc;

public class Test {
	public static void main(String[] args) {
		//MyJDBC obj1 = new MyJDBC();
		//obj1.connect();
		//obj1.create_table();		
		//obj1.insert_record();
		//obj1.update_record();
		//obj1.delete_record();
		//obj1.select_records();
		//obj1.search_records();
		
		MyJDBC2 obj2 = new MyJDBC2();
		
		Person obj_person = new Person();//Default constructor
		obj_person.setId(1);
		obj_person.setFull_name("Rajest Rai");
		obj_person.setContact_address("KTM");				
	
		obj2.insert_record(obj_person);
	}
}