package unit7_oops;

public class Class9 extends Class7 {
	private int num2;

	public Class9() {
		super();//Super Class Constructor
		this.num2 = 0;
	}
	
	public Class9(int num1, int num2) {
		super(num1);
		this.num2 = num2;
	}

	@Override
	public int getNum1() {
		return super.getNum1();
	}
	
	@Override
	public void setNum1(int num1) {
		super.setNum1(num1);
	}
	
	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return super.toString()+", num2=" + this.num2;
	}		
}