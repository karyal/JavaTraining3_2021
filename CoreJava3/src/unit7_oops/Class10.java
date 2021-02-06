package unit7_oops;

public class Class10 extends Class9 {
	private int num3;

	public Class10() {
		super();
		this.num3 = 0;
	}
	
	public Class10(int num1, int num2) {
		super(num1, num2);
		this.num3 = 0;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public void sum() {
		this.setNum3(this.getNum1()+this.getNum2());
	}
	
	//create functions i.e. sub, prd, div
	
	@Override
	public String toString() {
		return super.toString()+", num3=" + num3+"]";
	}	
}
