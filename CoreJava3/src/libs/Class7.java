package libs;

public class Class7 {
	//instance variable
	int num1; //yes - same package - default
	private int num2;//no 
	protected int num3; //yes - same package
	public int num4; //yes - all
	
	//Constructors
	public Class7() {
		this.num1 = 0;
		this.num2 = 0;
		this.num3 = 0;
	}
	
	public Class7(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = 0;
	}
	
	public Class7(Class7 class5) {
		this.num1 = class5.num1;
		this.num2 = class5.num2;
		this.num3 = class5.num3;
	}

	//Getters and Setters
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	//Process Method
	public void sum() {
		this.setNum3(this.getNum1()+this.getNum2());
	}
	
	//Task: 
		//add methods to substraction, multiplication, division, and others
	
	//toString
	@Override
	public String toString() {
		return "Class5 [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + "]";
	}		
}