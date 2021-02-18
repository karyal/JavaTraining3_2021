package unit4_collections.collections;

import java.util.Arrays;
import java.util.List;

public class ArraysExample {
	public static void main(String[] args) {
		String fruits[] = {"Apple","Watermelon","Orange","Pear","Cherry","Strawberry","Nectarine","Grape", "Mango", "Blueberry"};
		int numbers[] = {2, 3, 1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 5, 6, 7};
		
		//asList()
		List list1 = Arrays.asList(fruits);
		System.out.println(list1.size());
		
		//binarySearch
		int result = Arrays.binarySearch(numbers, 2);
		System.out.println(result);		
		
		//copyOf
		int numbers2[] = Arrays.copyOf(numbers, 5);
		System.out.println(numbers2.length);
		
		//copyOfRange
		int numbers3[] = Arrays.copyOfRange(numbers, 0, 4);
		System.out.println(numbers3.length);
		
		/*
		Object obj1 = new String("Kathmandu");
		Object obj2 = new String("kathmandu");
		
		boolean result2 = Arrays.deepEquals(obj1, obj2);
		
		int has_code = Arrays.deepHashCode(numbers3);
		*/
		
		//equals
		boolean result2 = Arrays.equals(numbers3, numbers2);
		System.out.println(result);
		
		//fill
		Arrays.fill(numbers3, 7);
		
		//hashCode
		int hash_code1 = Arrays.hashCode(numbers3);
		System.out.println(hash_code1);
		
		//parallelSort
		Arrays.parallelSort(numbers2);
		Arrays.parallelSort(numbers3, 0, 3);
		
		//sort
		Arrays.sort(numbers2);
		
		//toString
		System.out.println(Arrays.toString(numbers2));
		
		
	}
}
