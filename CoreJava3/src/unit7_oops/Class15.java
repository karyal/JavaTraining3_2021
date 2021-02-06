package unit7_oops;

public class Class15 implements Inf1, Inf2, Inf3{
	
	@Override
	public void f1() {
		System.out.println(Inf1.num1);
		System.out.println(Inf2.num1);
	}
	
	@Override
	public void f2() {
		System.out.println(Inf3.num1);		
	}
	
	public Class15() {
		f1();
		f2();
		Inf3.f3();
	}
}