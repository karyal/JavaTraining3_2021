package unit7_oops;

public class Class7 {
	private int num1;

	public Class7() {
		this.num1 = 0;
	}
	
	public Class7(int num1) {
		this.num1 = num1;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	@Override
	public String toString() {
		return "[num1=" + this.num1;
	}		
}