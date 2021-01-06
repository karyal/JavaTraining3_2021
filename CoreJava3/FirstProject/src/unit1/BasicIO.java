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
		String name = readString("Enter your name : ");	
		System.out.println("Name : "+name);
	}
	
	public static String readString(String msg) {		
		String str_tmp;
		System.out.print(msg);
		str_tmp = new Scanner(System.in).nextLine();
		return str_tmp;
	}
}
