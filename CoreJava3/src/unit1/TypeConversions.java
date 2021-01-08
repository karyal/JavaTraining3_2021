package unit1;

import libs.MyFunctions;

public class TypeConversions {
	
	public static void main(String[] args) {
		
		//A. Type Conversion (String - Numeric/Numeric - String)
		//1. Boolean
		//1.1. String to boolean
		String str1 = "true";
		boolean res = Boolean.parseBoolean(str1); //String to boolean
		MyFunctions.print("Boolean ", res);
		res = false;
		
		//1.2. Boolean to String
		//str1 = Boolean.toString(res); 
		//MyFunctions.print("String", str1);				
		
		//2. String
		//2.1 String to boolean	- Boolean	
		//2.2 String to byte - Byte
		//2.3 String to short - Short
		//2.4 String to int - Integer
		//2.5 String to long - Long
		//2.6 String to float - Float
		//2.7 String to double - Double
		
		str1= "123";
		byte bn1 = Byte.parseByte(str1);
		bn1+=2;
		MyFunctions.print("Byte", bn1);
		bn1 = 67;
		str1=Byte.toString(bn1);
		MyFunctions.print("Byte-String", str1+2);
		
		
		//Type Casting		
		//Numeric-Numeric		
		// Widening  : byte->short->int->long->float->double (No Value Losses)
		str1="123";
		bn1 = Byte.parseByte(str1);//String to Byte
		short sn1 = bn1;
		int in1 = sn1;
		long ln1 = in1;
		float fn1 = ln1;
		double dn1 = fn1;
		MyFunctions.print("Double", dn1);
				
		// Narrowing : byte<-short<-int<-long<-float<-double (Value Losses)		
		dn1=12345678.54323;
		fn1 =(float) dn1;
		ln1 = (long) fn1;
		in1 = (int) ln1;
		sn1 = (short) in1;
		bn1 = (byte) sn1;
		MyFunctions.print("Byte", bn1);						
		
	}
}