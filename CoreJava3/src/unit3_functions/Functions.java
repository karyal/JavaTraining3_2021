package unit3_functions;

public class Functions {
	
	public static void f001() {
		System.out.println("Hello from f001()");
	}
	
	public void f002() {
		System.out.println("Hello from f002()");
	}
	
	//No Return Type; No Parameter
	public static void f1() {
		System.out.println("Hello from f1()");
	}
	
	//Return Type; No Parameter	
	public static int f2() {
		int n1, n2, n3;
		n1=9;
		n2=6;
		n3 = n1+n2;
		return n3;		
	}
	
	//No Return Type; Parameterized	
	public static void f3(int n1) {
		n1++;
		System.out.println(n1);
	}
	
	//Return Type; Parameterized	
	public static int f4(int n1) {
		n1++;
		return n1;
	}
	
}