package libs;

import java.util.Scanner;

public class MyFunctions {
	
	public static void print(String label, boolean message) {
		System.out.println(label+" : "+message);
	}
	
	public static void print(String label, byte message) {
		System.out.println(label+" : "+message);
	}
	
	public static void print(String label, short message) {
		System.out.println(label+" : "+message);
	}
	
	public static void print(String label, int message) {
		System.out.println(label+" : "+message);
	}
	
	public static void print(String label, long message) {
		System.out.println(label+" : "+message);
	}
	
	public static void print(String label, float message) {
		System.out.println(label+" : "+message);
	}
	
	public static void print(String label, double message) {
		System.out.println(label+" : "+message);
	}
	
	public static void print(String label, String message) {
		System.out.println(label+" : "+message);
	}
	
	public static void print(String msg) {
		System.out.print(msg);
	}
	
	public static String readString(String msg) {		
		print(msg);
		return new Scanner(System.in).nextLine();
	}	
}
