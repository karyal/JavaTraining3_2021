package unit7_oops;


public class OOPTest2 {

	public static void main(String[] args) {		
		//f8();
		//f9();
		f10();
	}
	
	public static void f10() {
		Class10 obj1=new Class10(58, 12);
		obj1.sum();		
		System.out.println(obj1);
	}
	
	public static void f9() {
		Class9 obj1 = new Class9();
		obj1.setNum1(8);
		obj1.setNum2(7);
		//System.out.println(obj1.getNum1());
		//System.out.println(obj1.getNum2());
		System.out.println(obj1);		
	}
	
	public static void f8() {
		Class7 obj1 = new Class7();		
		Class8 obj2 = new Class8();
		//System.out.println(obj1);
		obj1.setNum1(5);
		obj2.setNum2(7);
		System.out.println(obj1);
		System.out.println(obj2);
		
		int result = obj1.getNum1()+obj2.getNum2();
		System.out.println(result);
	}
}