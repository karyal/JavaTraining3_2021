package unit1;

import libs.MyFunctions;

public class Operators {
	
	public static void main(String[] args) {
		//ArithmeticOperators();
		//AssignmentOperators();
		ComparisionOperators();
		
	}
	public static void ComparisionOperators() {
		//Compare | Relational Operator
		//Data Type [numeric, boolean, char]
		//Compare two values and generate boolean result (true/false)
		
		//Declare
		int n1, n2;
		boolean res1, res2, res3, res4, res5, res6;
		
		//Input
		n1 = 9;
		n2 = 9;
		
		//Process
		res1 = (n1==n2); //n1 is equals to n2
		res2 = (n1!=n2); //n1 is not equals to n2
		res3 = (n1>n2); //n1 is gt n2
		res4 = (n1<n2); //n1 is lt n2
		res5 = (n1>=n2); //n1 is gte n2
		res6 = (n1<=n2); //n1 is lte n2
		
		//Output
		MyFunctions.print("==", res1);
		MyFunctions.print("!=", res2);
		MyFunctions.print(">", res3);
		MyFunctions.print("<", res4);
		MyFunctions.print(">=", res5);
		MyFunctions.print("<=", res6);
		
		//Testing Phase
			// Developer
			// QA-System Auditor
		
		//Testing 
			// - WhiteBox Testing - Source Code Testing 
			// - BlackBox Testing - Application Testing (by running app)
		
		//Task
			// Find largest number from two numbers.
			// Find largest number from three numbers.
		
	}
	
	public static void AssignmentOperators() {
		//Assign -> Stores -> right value to left variable
		// = 
		//1. Simple Assignment
		int n1 = 89;//89 assign to n1
		
		//2. Multiple Assignment
		int n2, n3, n4;
		n2 = n3 = n4 = 90;
		
		//3. Short-Hand Assignment Operators		
		n1 = 40;
		n2 = 5;						
		n1+=n2; // n1 = n1+n2;
		n1-=n2;
		n1*=n2;
		n1/=n2;
		n1%=n2;				
	}
	
	public static void ArithmeticOperators() {
		//+, -, *, /, %, power, square root
		//Data types : byte, short, int, long, float, double
		
		//Declare
		int n1, n2, n3, n4, n5, n6, n7, n8, n9;
		
		//Input
		//n1=10; //Static Value | Dynamic Value
		//n2=3; //Static Value | Dynamic Value
		
		n1 = Integer.parseInt(MyFunctions.readString("Enter first no")); //20
		n2 = Integer.parseInt(MyFunctions.readString("Enter second no")); //25
				
		//Process
		//Swap
		if (n2>n1) {
			int tmp = n1;
			n1=n2;
			n2=tmp;
		}
		
		n3 = n1+n2; //Add
		n4 = n1-n2; //Sub
		n5 = n1*n2; //Prd
		n6 = n1/n2; //Div
		n7 = n1%n2; //Rem		
		n8 = (int) Math.pow(n1, n2); //n1-base, n2-exp
		n9 = (int) Math.sqrt(n1); //Square
		
		//Output
		MyFunctions.print("Sum", n3);
		MyFunctions.print("Difference", Math.abs(n4));//abs() method convert -ve number to +ve
		MyFunctions.print("Prd", n5);
		MyFunctions.print("Div", n6);
		MyFunctions.print("Rem", n7);
		MyFunctions.print("Power", n8);
		MyFunctions.print("Root", n9);
		
	}
	
	
}