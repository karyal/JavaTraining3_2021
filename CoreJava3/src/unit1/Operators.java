package unit1;

import libs.MyFunctions;

public class Operators {
	
	public static void main(String[] args) {

		//ArithmeticOperators();
		//AssignmentOperators();
		//ComparisionOperators();
		//LogicalOperators();
		//ConditionalOperator();
		//Bitwise() - Low Level Programming
		// Other Operators
		OtherOperators();
	}
	
	public static void OtherOperators() {
		//a. Increment and Decrement Operator
		
		// Increment Operator (++)
		// Increment Operator - Whole Number (Integer Family)
		// Increase Value by 1
		
		//Example
		int n1=0;
		n1++; //Increment Operator - Post
		MyFunctions.print("",n1);
		++n1; //Increment Operator - Pre
		MyFunctions.print("",n1);
		
		// Decrement Operator (--)
		// Decrement Operator - Whole Number (Integer Family)
		// Decrease Value by 1
		
		//Example
		n1=10;
		n1--; //Decrement Operator - Post
		MyFunctions.print("",n1);
		--n1; //Decrement Operator - Pre
		MyFunctions.print("",n1);
		
//Task
// Difference between pre and post increment operator		
		//pre
		
		//increase than print
		System.out.println(++n1);
		
		//print than increase
		System.out.println(n1++);
				
// Increase/Decrease by other than 1.
		n1 = 0;
		n1=n1+3;
		n1+=3;
		MyFunctions.print(n1);
		
		//b. [], (), {}, .
		
		//c. instanceof - Check the object type (OOP)?
		
	}
	
	public static void ConditionalOperator() {
		//Conditional Operator

		// (Condition)?Result1:Result2
		//	(true)-return resutl1
		//	(false)-return result2
		
		//decalre
		int n1, n2, n3;
		
		//input
		n1 = 3;
		n2 = 4;
		
		//process
		n3 = (n1>n2)?n1:n2;
		
		MyFunctions.print("Result", n3);
		
		//Task
			// Find largest number from three/four/five/N numbers.
			// sub1=85, sub2=78, sub3=39, PM=40 calculate total, average, result									
	}
	
	public static void LogicalOperators() {
		//Logical Operator
		
		//Comparison Operator (==, !=, >, >=, <, <=) 
		//Compare two values and generate boolean result (true/false)
		
		//Condition
		//(value1 ComparisonOperator value2) -> true/false
		
		//Logical Operator
		//Compares two or more than two conditions and generate boolean result (true/false).
		
		/*
		
		(1>0) -> true/false - c1
		(5>2) -> true/false - c2
		(5>7) -> true/false - c3
				
		a. Logical AND [&&] - And Gate
		
		Condition1	Condition2	Result
		True		True		True
		False		True		False
		True		False		False
		False		False		False
				
		b. Logical OR [||] - Or Gate
		
		Condition1	Condition2	Result
		True		True		True
		False		True		True
		True		False		True
		False		False		False
		
		c. Logical NOT [!]
		Condition	Result
		(true) 		False
		(false)		True						
		*/
		
		//Examples-1		
		//Declare		
		int n1, n2, n3;
		boolean res1, res2, res3, res4;
		
		//Input
		n1=9;
		n2=30;
		n3=4;
		
		//Process
		res1 = (n1>n2); //false
		res2 = (n1>n3); //true
		//  (false && true) -> false
		// res3 =(res1 || res2) ->true
		res3 =(res1 || res2);
		
		res4 = !res3;
		
		//Output
		MyFunctions.print("Final Result", res3);
		MyFunctions.print("Final Result", res4);				
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