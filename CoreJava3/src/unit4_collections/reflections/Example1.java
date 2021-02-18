package unit4_collections.reflections;

import java.lang.reflect.Modifier;

public class Example1 {
	public static void main(String[] args) {
		//Getting Class Info
		Class c1 = Person1.class;
		
		System.out.println(c1);				
		System.out.println(c1.getName()); //collections.reflections_.Person
		System.out.println(c1.getSuperclass().getName()); //java.lang.Object
		
		Class []interfaces = c1.getInterfaces(); //java.lang.Object
		//System.out.println(interfaces.length);
		for(Object item : interfaces) {
			System.out.print(item+",");			
		}		
		System.out.println();
		int modifier = c1.getModifiers();
		System.out.println(Modifier.toString(modifier));
	}
}