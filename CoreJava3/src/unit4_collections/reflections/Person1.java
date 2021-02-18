package unit4_collections.reflections;

import java.io.Serializable;

public class Person1 implements Serializable, Cloneable {
	private String fullName;
	private String contactAddress;
	
	public Person1() {
		this.fullName = "";
		this.contactAddress = "";
	}

	public Person1(String fullName, String contactAddress) {	
		this.fullName = fullName;
		this.contactAddress = contactAddress;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	@Override
	public String toString() {
		return "Person [fullName=" + fullName + ", contactAddress=" + contactAddress + "]";
	}		
}