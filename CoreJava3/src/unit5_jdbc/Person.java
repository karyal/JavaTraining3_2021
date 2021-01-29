package unit5_jdbc;

public class Person {
	//Member variable //instance variable
	private int id;
	private String full_name;
	private String contact_address;
	
	//Functions same name with Class i.e. Constructor
	public Person() {//Default constructor
		this.id = 0;
		this.full_name = "NA";
		this.contact_address = "NA";
	}
	
	public Person(int id, String full_name, String contact_address) {//Parameterized constructor
		this.id = id;
		this.full_name = full_name;
		this.contact_address = contact_address;
	}

	//Getters/Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getContact_address() {
		return contact_address;
	}

	public void setContact_address(String contact_address) {
		this.contact_address = contact_address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", full_name=" + full_name + ", contact_address=" + contact_address + "]";
	}
}