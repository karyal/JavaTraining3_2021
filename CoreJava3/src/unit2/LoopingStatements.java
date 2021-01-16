package unit2;

import libs.MyFunctions;

public class LoopingStatements {
	public static void main(String[] args) {
		//whileLoop();
		//doWhileLoop();
		//forLoop();
		//continue_break();		
	}
	
	public static void continue_break() {
		
		for(int i=1; i<=10; i++) {
			/*
			if (i==5) {
				break;
			}
			*/
			if (i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
		
	public static void forLoop() {
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
	}
	
	public static void doWhileLoop() {
		int n1, n2;
		n1=1;
		n2=10;
		do {
			System.out.print(n1+" ");
			n1++;
		}while(n1<=n2);
	}
	
	public static void whileLoop() {
	//Looping statements
	//Loop Design
		//Step-1: Start Value
		//Step-2: Stop Value
		//Step-3: Condition
		//Step-4: Statement(s)
		//Step-5: Modifier (Increment/Decrement)
	
	//while loop
	/*
	 while(condition){
	 	Statement(s)
	 }
	 */
	/*
		int start, stop;
		start=1; //start
		stop=10; //stop
		while(start<=stop) { //condition
			MyFunctions.print(start+" "); //statement (s)
			start++; //modifier
		}
	 */
	}
}
