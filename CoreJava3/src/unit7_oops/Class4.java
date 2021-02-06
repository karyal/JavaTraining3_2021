package unit7_oops;

public class Class4 {
	//Instance variables	
	int num1;
	int num2;
	
	//Default Constructor
	public Class4() {
		this.num1=0;
		this.num2=0;
	}
	
	//Parameterized Constructor
	public Class4(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	//Copy Constructor
	public Class4(Class4 obj1) {
		this.num1=obj1.num1;
		this.num2=obj1.num2;
	}
	
	//Getters
	public int getNum1() {
		return this.num1;
	}
	
	public int getNum2() {
		return this.num2;
	}
	
	//Setters
	//Value update/change individually
	public void setNum1(int num1) {
		this.num1=num1;
	}
	
	public void setNum2(int num2) {
		this.num2=num2;
	}
	
	//toString Method
	@Override
	public String toString() {
		return "num1:"+this.num1+", num2:"+this.num2;
	}
	
}
