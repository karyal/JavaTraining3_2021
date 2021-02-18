package unit7_oops.inner_classes;

interface Message {
	String f1();
}

public class AnonymousInnerClassTest2 {
	
	public void print_message(Message m) {
		System.out.println(m.f1());
	}
	
	public static void main(String []args) {
		
		AnonymousInnerClassTest2 obj1 =  new AnonymousInnerClassTest2();
		obj1.print_message(new Message() {			
			@Override
			public String f1() {
				return "Hello from f1()";
			}
		});
	}	
}