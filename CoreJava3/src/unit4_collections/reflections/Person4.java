package unit4_collections.reflections;

public class Person4 {
	private String name;

	public Person4() {		
		this.name = "";
	}
	
	public Person4(String name) {		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person4 [name=" + name + "]";
	}		
}
