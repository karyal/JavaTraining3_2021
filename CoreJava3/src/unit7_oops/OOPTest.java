package unit7_oops;

import libs.Class7;

public class OOPTest {
	
	public static void main(String[] args) {
		//Class and Object
		//f1();
		//f2();
		//f3();
		//f4();
		//f5();
		//f6();
		//f7();
			
	
		
		
	}		
	
	public static void f7() {
		Class7 obj1 = new Class7();
		//System.out.println(obj1.num1); //no - different package
		//System.out.println(obj1.num2); //no - anywhere
		//System.out.println(obj1.num3); //no - different package
		//System.out.println(obj1.num4); //yes - anywhere		
		//indirect access using setter method		
	}
	
	public static void f6() {
		
		Class6 obj1=new Class6();
		obj1= new Class6(30, 5);
		obj1.setNum1(17);
		obj1.sum();
		System.out.println(obj1);
		System.out.println(obj1.getNum3());
		
		obj1.num1=9;
		//obj1.num2=3;//Cann't access private member
		//obj1.num3=3;//Cann't access private member
		obj1.sum();
		System.out.println(obj1);
		
	}
	
	public static void f5() {
		Class5 obj1, obj2, obj3, obj4;
		
		obj1=new Class5();
		obj2=new Class5(78, 22);
		obj3=new Class5(obj2);//Copy by value
		obj4=obj2; //Copy by reference
		
		//call toString
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		//getters
		System.out.println(obj1.getNum1()+", "+obj1.getNum2());
		System.out.println(obj2.getNum1()+", "+obj2.getNum2());
		System.out.println(obj3.getNum1()+", "+obj3.getNum2());
		System.out.println(obj4.getNum1()+", "+obj2.getNum2());
		
		//Setters
		obj1.setNum1(8);
		obj1.setNum2(2);
		
		obj4.setNum1(5);
		obj4.setNum2(3);
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		obj1.sum();
		obj2.sum();
		obj3.sum();
		obj4.sum();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
	}
	
	public static void f4() {
		Class4 obj1, obj2, obj3, obj4;
		
		obj1=new Class4();//Default Ctor
		obj2=new Class4(23, 34);//Parameterized Ctor
		obj3=new Class4(obj2); //Copy constructor
		
		obj4 = obj3; //Copy By Reference
		
		//Display all instance variables
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		//Display hashCode of object
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		
		//print instance variable individually
		System.out.println(obj3);//All
		System.out.println(obj3.getNum1()); //Num1
		System.out.println(obj3.getNum2()); //Num1
		
		//Setters
		System.out.println(obj2);
		obj2.setNum1(32);
		
		//Getters
		System.out.println(obj2.getNum1());
		System.out.println(obj2.getNum2());
		System.out.println(obj2);
	}
	
	public static void f3() {
		Class3 obj1, obj2, obj3, obj4, obj5; //Declare
		
		obj1 = new Class3();//Allocate Memory for obj1
		obj2 = new Class3();//Allocate Memory for obj2
		obj3 = new Class3();//Allocate Memory for obj3
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		System.out.println(obj1.num1+","+obj1.num2); //Default value allocated by Constructor
		System.out.println(obj2.num1+","+obj2.num2); //Default value allocated by Constructor
		System.out.println(obj3.num1+","+obj3.num2); //Default value allocated by Constructor
		
		obj1.num1 = 9;
		obj1.num2 = 3;
		System.out.println(obj1.num1+","+obj1.num2);
		
		obj2.num1 = 8;
		obj2.num2 = 4;
		System.out.println(obj2.num1+","+obj2.num2);
		
		obj3.num1 = 5;
		obj3.num2 = 2;
		System.out.println(obj3.num1+","+obj3.num2);
		
		//Initialize by Parameterized Constructor
		obj4 = new Class3(); //Default Constructor
		
		obj5 = new Class3(7, 6); //Parameterized Constructor
		obj5 = new Class3(8, 3);
		
		System.out.println(obj4.num1+","+obj4.num2);
		System.out.println(obj5.num1+","+obj5.num2);
		
		Class3 obj6 = new Class3(obj5);
		System.out.println(obj6.num1+","+obj6.num2);
		
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
		
		Class2 obj3, obj4;
		
		obj2 = new Class2(); //Re-initialize
		obj3 = new Class2(); //Initialize	
		obj4 = new Class2(); //Initialize
		
		if (obj3 instanceof Class2) {
			System.out.println("TRUE");
		}
		
		if (obj3 == obj4) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
		
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		
		Class2 obj5, obj6; //Declare - No Auto initialize
		obj5 = new Class2(); //Initialize obj5 (Allocate Memory for obj5)
		obj6 = obj5 ; //Memory allocated by obj5 is assigned on obj6 - Reference of Memory
		
		System.out.println(obj5.hashCode());
		System.out.println(obj6.hashCode());
		
		obj5.num1 = 4;//Store
		obj6.num2 = 5;//Store
		System.out.println(obj6.num1); //Access
		System.out.println(obj5.num2); //Access
		
		obj6 = new Class2(); //Allocate new address for obj6
		System.out.println(obj5.hashCode());
		System.out.println(obj6.hashCode());
		
		obj5 = obj6;
		System.out.println(obj5.hashCode());
		System.out.println(obj6.hashCode());
		
		if(obj5 == obj6) {//Preferred to check equality of basic types
			System.out.println("TRUE");
		}
		
		if(obj5.equals(obj6)) {//Preferred to check equality of object 
			System.out.println("TRUE");
		}				
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