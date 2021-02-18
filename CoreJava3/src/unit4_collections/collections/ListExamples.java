package unit4_collections.collections;

import java.util.ArrayList;
import java.util.List;

class Person {
	String full_name;
	String contact_address;
	
	public Person() {
		this.full_name="";
		this.contact_address="";
	}
	public Person(String full_name, String contact_address) {
		this.full_name=full_name;
		this.contact_address=contact_address;
	}
	public String toString() {
		return this.full_name+", "+this.contact_address;
	}
}

public class ListExamples {
	
	public void listExample1() {
		Person p1 = new Person("Raj Rai","KTM");
		
		//Adding Values
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		list1.add(1);
		list1.add('A');
		list1.add(1234);
		list1.add(1234567);
		list1.add(123456789L);
		list1.add(1234.567F);
		list1.add(123456789.1233456789);
		list1.add("Kathmandu");
		list1.add(p1);
		list1.add(1,true);
		
		int nums1[] = {2,3,4,5,5};
		int nums2[] = {9,2,3,4,5};
		
		list1.add(nums1);		
		list1.add(5, nums1);
		
		list2 = list1;
		
		System.out.println("Size : "+list1.size());
		System.out.println("Size : "+list2.size());
		
		System.out.println("Size : "+list1.hashCode());
		System.out.println("Size : "+list2.hashCode());
		
		for(Object obj : list1) {
			if(obj instanceof Person) 
				System.out.println(obj.toString());
			else {
				System.out.println(obj);
			}
		}
	}
	public static void main(String[] args) {
		new ListExamples().listExample1();
	}
}
