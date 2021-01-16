package unit3;

public class FunctionTest {
	public static void main(String[] args) {
		
		//Calling static function
		//Functions.f001(); 
		
		//Calling non-static function
		Functions fc = new Functions(); //Object Declare and Initialize
		//fc.f002();
		
		//Calling functions
		//1. No Return Type; No Parameter
		Functions.f1();
		
		//2. Return Type; No Parameter	
		int tmp =  Functions.f2();
		System.out.println(tmp);
		
		//3. No Return Type; Parameterized
		int a1 = 8;
		Functions.f3(a1);
		
		//4. Return Type; Parameterized
		int a2 = 9;
		int r1 = Functions.f4(a2);
		System.out.println(r1);		
		
		//Task : Create and call functions as more as possible (all categories)
			//1. Accept inputs from user (i.e. Student Info - id, name, standard, sub1, sub2, sub3, sub4)
			//2. Calculate total, average, result (PM=40)
			//3. Functions and FunctionsTest should be in separate java file.
		
		
	}
}