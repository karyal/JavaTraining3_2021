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
		/*
		String name;
		int num1;
		double num2;
		
		//Input
		//reading string
		name = readString("Enter your name : ");
		
		//reading integer number		
		num1 = Integer.parseInt(readString("Enter any number (whole number) : ")); //String to int -> Type Conversion
		
		//reading floating (float/double) point number		
		num2 = Double.parseDouble(readString("Enter any number (floating point number) : ")); //String to int -> Type Conversion
		
		System.out.println("String : "+name);
		System.out.println("Integer : "+num1);
		System.out.println("Double : "+num2);
		
		
		//String -> boolean, byte, short, int, long, float, double and VS.		
		//Boolean, Byte, Short, Integer, Long, Float, Double, String - Wrapper Classes (Store Value, and Type Conversion)
		
		//Object -> Data Type ?
		*/
		
		int id;
		String full_name, contact_address, email_address, phone_no;
		double income, expenses;
		
		//Read above personal info from keyboard and display saving amount too.
		
	}
	/*
	//Input Function
	public static String readString(String msg) {		
		String str_tmp;
		System.out.print(msg);
		str_tmp = new Scanner(System.in).nextLine();
		return str_tmp;
	}
	*/
}
