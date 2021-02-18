package unit4_collections.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Example4 {
	public static void main(String[] args) {
		Person4 person4 = new Person4();
		Class c4 = person4.getClass();
		
		//Get Constructors
		Constructor [] ctors = c4.getConstructors();
		for (Constructor ctor: ctors) {
			System.out.println("Name : "+ ctor.getName());
			int modifier = ctor.getModifiers();
			System.out.println("Modifier : "+Modifier.toString(modifier));
			System.out.println("Parameters : "+ctor.getParameterCount());
		}
		System.out.println();
	
		//Get Methods
		Method[] methods = c4.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println("Method Name: " + method.getName());
			System.out.println("Modifier : " + Modifier.toString(method.getModifiers()));
			System.out.println("Return Type : " + method.getReturnType());
			System.out.println("Parameter Count: " + method.getParameterCount());
			Parameter [] parameters = method.getParameters();
			for(Parameter parameter: parameters) {
				System.out.println(parameter.toString());
			}
			System.out.println();
		}
	}
}