package unit2;

import libs.MyFunctions;

public class IfStatements {
	public static void main(String[] args) {
		//if1();
		//switch1();
	}
	
	public static void switch1() {
		//switch case (int, char) 
		//Example
		int n1 = 8;
		switch(n1) {
			case 0:
				MyFunctions.print("ZERO");
				break;
			case 1:
				MyFunctions.print("ONE");
				break;
			case 2:
				MyFunctions.print("TWO");
				break;
			case 3:
				MyFunctions.print("THREE");
				break;
			case 4:
				MyFunctions.print("FOUR");
				break;
			case 5:
				MyFunctions.print("FIVE");
				break;
			default:
				MyFunctions.print("OTHERS");
		}		
	}
	
	public static void if1() {
		//Conditional Operators (==, !=, >, >=, <, <=)
		//Condition Two Values, one Conditional Operator
		//Logical Operators (&&, ||)
		
		/*
			Syntax			
			if (condition){
				Statement for true
			}			


		//if Example
		int n1 = 0;
		boolean res = (n1==0); 
		if(res==true)  {
			MyFunctions.print("ZERO");
		}	
		
		n1 = 8;
		if(n1==0){
			MyFunctions.print("ZERO");
		}	
		
		//if else statement
		 Syntax
		 if (condition1){
		 	Statement for true
		 }
		 else{
		 	Statement for false
		 }
		 		
		int n1, n2;
		n1 = 90;
		n2 = 78;
		if(n1>n2) {
			MyFunctions.print(n1);
		}
		else {
			MyFunctions.print(n2);
		}
		
		
		//else if .... else
		Syntax
		if(Condition1){
			Statement-1 for true
		}
		else if (Condition2){
			Statement-2 for true
		}
		else{
			Statement-2 for false (all)
		}		
		
		
		//Example
		int n1=1;
		
		if(n1==0) {
			MyFunctions.print("ZERO");
		}
		else if(n1==1) {
			MyFunctions.print("ONE");
		}
		else if(n1==2) {
			MyFunctions.print("TWO");
		}
		else if(n1==3) {
			MyFunctions.print("THREE");
		}
		else if(n1==4) {
			MyFunctions.print("FOUR");
		}
		else if(n1==5) {
			MyFunctions.print("FIVE");
		}
		else {
			MyFunctions.print("OTHER");
		}
		
		//Nested if Statement (Logical AND)
		Syntax
			if(Condition1)
				if(Condition2)
					Statement for true
		
		
		int n1, n2, n3;
		n1 = 9;
		n2 = 8;
		n3 = 6;
		
		if (n1>n2)
			if(n1>n3)
				MyFunctions.print(n1);
		
		
		//If Statement with multiple conditions
		Syntax
		
		if(Condition1 LogicalOperator Condition2)
		 	Statement for true
		 
		*/
		int n1, n2, n3;
		n1 = 9;
		n2 = 8;
		n3 = 6;
		
		if((n1>n2) && (n1>n3))
			MyFunctions.print(n1);
		
		
		
	}
}
