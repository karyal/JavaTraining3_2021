package unit4_collections.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, String> person = new HashMap<String, String>();//Key, Value paring
		person.put("pid", "1");
		person.put("full_name", "Raj Rai");
		person.put("contact_address", "Kathmandu, Nepal");
		
		System.out.println(person);
		
		System.out.println(person.get("pid"));		
	
		System.out.println(person.size());				
		
		for(String str : person.keySet()) {
			System.out.println(str);
		}
		
		for(String str : person.values()) {
			System.out.println(str);
		}
		
		System.out.println(person.remove("pid"));
	}
}