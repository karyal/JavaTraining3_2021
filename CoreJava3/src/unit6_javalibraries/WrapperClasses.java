package unit6_javalibraries;

public class WrapperClasses {
	public static void main(String[] args) {
		String str1 = "123";
		int num1 = 13;
		
		num1 =Integer.parseInt(str1); //String to Integer
		System.out.println(num1);
		
		str1 = Integer.toString(num1); //Integer to String
		System.out.println(str1);
		
		//Boolean, Character, Byte, Short, Integer, Long, Float, Double
		
	}
}
