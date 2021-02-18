package unit7_oops.inner_classes;

public class OuterClassTest {
	
	public static void main(String[] args) {
		
		OuterClass obj1 =  new OuterClass();
		obj1.f1();
		
		OuterClass.InnerClass obj2 =  obj1.new InnerClass();
		obj2.f1();
		
		//OuterClass.InnerClass obj3 =  obj1.new InnerClass();
		//obj3.f2();
		
	}
	
}