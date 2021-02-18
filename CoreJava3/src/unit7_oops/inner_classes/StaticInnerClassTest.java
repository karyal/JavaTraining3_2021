package unit7_oops.inner_classes;

public class StaticInnerClassTest {
	static class InnerClass{
		public void f1() {
			System.out.println("Hello from f1() of InnerClass.");
		}
	}
	
	public static void main(String[] args) {
		StaticInnerClassTest.InnerClass obj1 = new StaticInnerClassTest.InnerClass();
		obj1.f1();				
	}
}