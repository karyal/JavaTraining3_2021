package unit1;
import java.util.Scanner;

public class BasicIO {
	/*
	Input/Output
	- Input/Output
		- keyboard/Display
		- file (plain file, html, xml, etc)
		- database (mysql, oralce, sql server, sqlite ect)		
		- web site
		- recorded/video	
	 */
	//Input from Keyboard and Display
	
	/*
 	//Reading String from Keyboard
		String str_tmp; //Variable declare (placeholder)
		System.out.print("Enter any string : "); //Prompt for user
		str_tmp = new Scanner(System.in).nextLine();//Read value from Keyboard
		System.out.println("Result : "+str_tmp);//Display Result
		
	 */
	
	public static void main(String[] args) {
		String name;
		int num1;
		
		//Input
		name = readString("Enter your name : ");
		num1 = Integer.parseInt(readString("Enter any number : ")); //String to int -> Type Conversion
		
		System.out.println("String : "+name);
		System.out.println("Integer : "+num1);
		
	}
	
	//Input Function
	public static String readString(String msg) {		
		String str_tmp;
		System.out.print(msg);
		str_tmp = new Scanner(System.in).nextLine();
		return str_tmp;
	}
}
