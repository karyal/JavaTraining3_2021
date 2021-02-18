package unit4_collections.reflections;

import java.lang.reflect.Field;

public class Example3 {
	public static void main(String[] args) {
		
		// Setting Value of Private Field
		try {
			Person3 person1 =  new Person3();
			Class class_obj = person1.getClass();
			
			Field field_name = class_obj.getDeclaredField("name");
			field_name.setAccessible(true);
			field_name.set(person1, "Kiran Rai");//Set
			System.out.println((String) field_name.get(person1)); //Get
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}
