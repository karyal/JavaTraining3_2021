package unit7_oops;

public class OOPTest {
	public static void main(String[] args) {
		//f1();
		f2();
	}
	
	public static void f2() {
		Class2 obj2;//declare
		obj2 = new Class2(); //Initialize - Store, Update, Retrieve (value(s))
		
		obj2.num1 = 9; //Store
		obj2.num2 = 4; //Store
		
		obj2.num1 = 90; //Update
		obj2.num2 = 9; //Update
		
		obj2.num3 = obj2.num1+obj2.num2; //Process
		
		System.out.println(obj2.num1+", "+obj2.num2+", "+obj2.num3);//Retrieve - Access				
	}
	
	public static void f1() {
		//Creating an object (variable) type of a Class		
		int num1; //variable declare - basic type
		Class1 obj1; //Object declare - user defined type - Class type
		
		//Assign value - Auto initialize by compiler
		num1 = 3;
		//Initialize an object and then we can store value on it. - Process of memory allocation and default value to an object.
		obj1 = new Class1();//
		
		//there are no any variables in Class1
		//there are no any methods in Class1
		
		//Checking the instance of Class - is the type of obj1 is Class1
		System.out.println(obj1 instanceof Class1);
		
		System.out.println(num1);
	}
}