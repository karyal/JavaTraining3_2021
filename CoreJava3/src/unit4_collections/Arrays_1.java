package unit4_collections;

import libs.MyFunctions;

public class Arrays_1 {
	public static void main(String[] args) {
		// Basic Type - Value type
		// Value type - Stores Single Value
		// boolean byte, char, short, int, long, float, double 

		// Collections
		// Single variable can holds multiple values
		// Array, ArrayList 
		
		//f1();
		//f2();
		//search();
		search1();
	}
	
	public static void f1() {
		//Declare array variable
		int num; //single valued variable		
		int nums[] = new int[5]; //multiple valued variable
		
		//Assing value
		num = 9;
		
		//Assign array
		nums[0] = 7;
		nums[1] = 2;
		nums[2] = 7;
		nums[3] = 6;
		nums[4] = 1;
		
		//Update
		num = 10;
		
		//Array Update
		nums[0] = 5;
		nums[1] = 3;
		nums[2] = 9;
		nums[3] = 1;
		nums[4] = 6;
		
		//Accessing single value variable
		System.out.println(num);
		
		//Accessing array varaible
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		
		
	}
	
	public static void f2() {
		//Accept inputs
		int [] nums = new int [5];
		// |------ nums -----|-- Variable Name
		// [7] [ ] [10] [ ] [ ] -- Value
		//  0   1   2   3   4  -- Index
		
		//Direct value assign
		nums[2]=10;
		nums[0]=7;
		
		//Accept inputs from keyboard
		for(int i=0; i<5; i++) {
			MyFunctions.print("Enter Number : ");
			nums[i] = MyFunctions.readInt();
		}
		
		//Process
		
		//Accessing values from array
		for(int i=0; i<5; i++) {
			MyFunctions.print("Number", nums[i]);
			MyFunctions.newLine();
		}
	
	}
	
	public static void search() {
		//decalre and initialize
		int nums[]= {4, 2, 4, 2, 5};
		int num = 5;
		int MAX = nums.length;//returns the number of elements
		
		boolean result=false;
		
		//input
		System.out.print("Enter number to search : ");
		num = MyFunctions.readInt();
				
		//find number in array
		for(int i =0; i<MAX; i++) {
			if (nums[i] == num) {
				result = true;
				break;
			}
		}
		
		//Result
		if(result==true) {
			System.out.println("found!");
		}
		else {
			System.out.println("not found!");
		}
	}
	
	public static void search1() {
		//Declare and initialize
		int nums[]= {4, 2, 4, 4, 2};		
		int num = 5;
		int MAX = nums.length;//returns the number of elements
		int nums2[]= new int[MAX];
		
		boolean result=false;
		int j=-1;
		
		//input
		System.out.print("Enter number to search : ");
		num = MyFunctions.readInt();				
		//find number in array
		
		for(int i =0; i<MAX; i++) {
			if (nums[i] == num) {
				j++;
				nums2[j]=i;							
			}
		}
		
		
		//Result
		if(j==-1) {
			System.out.println("not found!");
		}
		else {
			System.out.println("found!");
			System.out.println("found "+(j+1) +" times");
			System.out.print("Element(s) : ");
			for(int tmp=0; tmp<=j; tmp++) {
				System.out.print(nums2[tmp]+" ");
			}
			System.out.println();
		}
	}
}

//Task: 
	//Calculate sum, average
	//Find max, min number
	//Find specific number (4)

	//Sorting array elements (ASC/DESC)?	
	//Collections in Java (ArrayList)?
	//JDBC - Java Database Connectivity?
	
	//MySQL and Tools
		//https://www.mysql.com/downloads/ - Community Edition
		//https://dev.mysql.com/downloads/workbench/
		//https://dev.mysql.com/downloads/connector/j/8.0.html
