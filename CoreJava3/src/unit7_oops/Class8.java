package unit7_oops;

public class Class8 {
	private int num2;

	public Class8() {
		this.num2 = 0;
	}
	
	public Class8(int num2) {
		this.num2 = num2;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return "Class8 [num2=" + num2 + "]";
	}
}