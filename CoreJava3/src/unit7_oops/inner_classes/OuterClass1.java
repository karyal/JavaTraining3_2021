package unit7_oops.inner_classes;

public class OuterClass1 {
	
	public void f1() {
		int x = 10;
		
		class InnerClass1 {
			void f1() {
				System.out.println("f1() of InnerClass X = "+x);
			}
		}
		
		InnerClass1 obj1 = new InnerClass1();
		obj1.f1();
	}	
}
