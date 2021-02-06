package unit7_oops;

public class Class3 {
	// Variable - Data Member - Property - Instance Variable
	int num1;
	int num2;
	
	//Constructor
		//Special function
		//Used to allocate memory address and initialize instance variable
		//Name same with Class Name
		//No Return type
	
	//Default Constructor
	public Class3() {
		/*
		int num1=5; //Local variable
		int num2=8;		
		//this.num1=-1; //this.num1 refers instance variable of current class
		this.num1=num1; //this.num1 refers instance variable of current class
		this.num2=num2; //this.num1 refers instance variable of current class
		//this.num1 - Instance variable		 
		*/
		
		this.num1=0;
		this.num2=0;
	}
	
	//Parameterized Constructor	
	public Class3(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	//Copy Constructor
	public Class3(Class3 obj1) {
		this.num1=obj1.num1;
		this.num2=obj1.num2;
	}	
	
	//Method overloading
		//same name of multiple functions with different parameter list
}