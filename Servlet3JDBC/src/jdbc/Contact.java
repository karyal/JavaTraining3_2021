package jdbc;

public class Contact {
	private int sn;
	private String name;
	private String address;
	private String email;
	private String phone;
	
	public Contact() {
		this.sn = 0;
		this.name = "";
		this.address = "";
		this.email = "";
		this.phone = "";
	}

	public Contact(int sn, String name, String address, String email, String phone) {
		this.sn = sn;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact [sn=" + sn + ", name=" + name + ", address=" + address + ", email=" + email + ", phone=" + phone
				+ "]";
	}			
}
