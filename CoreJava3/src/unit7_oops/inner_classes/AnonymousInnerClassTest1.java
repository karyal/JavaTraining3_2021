package unit7_oops.inner_classes;

abstract class AnonymousInnerClass1{ //Must Extends
	public abstract void f1();
}

public class AnonymousInnerClassTest1 {
	public static void main(String[] args) {
		
		AnonymousInnerClass1 obj1 = new AnonymousInnerClass1() {
			@Override
			public void f1() {
				System.out.println("Hi from f1() method");
			}
		};
		
		obj1.f1();
	}
}
