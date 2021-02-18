package unit4_collections.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Example2 {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Person2 person1 =  new Person2();
		Class c1 = person1.getClass();
		
		Field []fields1 = c1.getFields();
		Field []fields2 = c1.getDeclaredFields();
		
		/*
		for(Object item: fields1) {
			//System.out.println(item);
		}
		*/
		
		//Accessing the values of fields 
		for(Field field: fields2) {
			String field_name = field.getName();
			Object field_type = field.getType();			
			int modifier = field.getModifiers();
			Object value = field.get(person1);
			
			System.out.println("Field Name : "+field_name);
			System.out.println("Field Type : "+field_type);			
			System.out.println("Modifier : "+Modifier.toString(modifier));
			System.out.println("Value : "+value);			
		}
		
		//Setting value on field
		System.out.println("Setting Values .......");
		Field field_id = c1.getDeclaredField("pid");
		Field field_name = c1.getDeclaredField("name");
		Field field_address = c1.getDeclaredField("address");
		field_id.setAccessible(true);
		field_name.setAccessible(true);
		field_address.setAccessible(true);
		field_id.set(person1, 2);
		field_name.set(person1, "Raj Thapa");
		field_address.set(person1, "Kathmandu, Nepal");
		
		//Getting value from fields
		System.out.println("Getting Values .......");
		System.out.println("ID : "+(int) field_id.get(person1));
		System.out.println("NAME : "+(String) field_name.get(person1));
		System.out.println("ADDRESS : "+(String) field_address.get(person1));
	}
}
