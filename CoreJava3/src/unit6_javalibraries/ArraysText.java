package unit6_javalibraries;

import java.util.Arrays;
import java.util.List;

public class ArraysText {
	public static void main(String[] args) {
		
		//Array to List		
		
		//1. List<T> asList(T... a)
		
		/*
		Integer myArray [] = new Integer[] {4, 5, 2, 1, 7};		
		//Array to List
		List<Integer> list1 = Arrays.asList(myArray);
		System.out.println(list1);
				
		for(int item : list1) {
			System.out.println(item);
		}		
		*/
		
		//2. int binarySearch(int[] a, int key)
		/*
		int myArray[] = {4, 5, 2, 8, 7};
		int key = 6;
		int result = Arrays.binarySearch(myArray, 0, myArray.length-1, key);
		System.out.println(result);
		*/
		
		//3. int compare(boolean[]a, boolean[]b)
		/*
		int myArray1[] = {4, 5, 2, 8, 85};
		int myArray2[] = {4, 5, 2, 8, 85};
		int result = Arrays.compare(myArray1, myArray2);
		if (result == 0) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not equals");
		}
		*/
		
		//int hashCode(int[] a)
		/*
		int myArray1[] = {4, 5, 2, 8, 85};
		int myArray2[] = {7, 5, 2, 8, 85};
		int result1 = Arrays.hashCode(myArray1);
		int result2 = Arrays.hashCode(myArray2);		
		System.out.println(result1+", "+result2);
		*/
		
		//void	parallelSort(int[] a, int fromIndex, int toIndex)
		int myArray1[] = {5, 4, 2, 8, 85};
		Arrays.parallelSort(myArray1);
		for(int n : myArray1) {
			System.out.print(n+" ");
		}
		
		//void	sort(int[] a)
		//void	sort(int[] a, int fromIndex, int toIndex)
		
		String str_myarray = Arrays.toString(myArray1);
		System.out.println(str_myarray);				
	}
}
