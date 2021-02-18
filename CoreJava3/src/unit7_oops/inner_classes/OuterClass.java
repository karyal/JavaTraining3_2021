package unit7_oops.inner_classes;

//Variable Scope (Visibility) and Lifetime (Existence of Variable on Memory)
public class OuterClass {
	
	private int x=10;
	
	public void f1() {
		new InnerClass().f1();
	}
	
	public void f2() {
		System.out.println("X = "+x);
	}
	
	public class InnerClass {
		public void f1() {
			System.out.println("Hi from f1() of InnerClass");
		}
		
		public void f2() {
			System.out.println("Inner Class : X = "+x);
		}
	}	
}