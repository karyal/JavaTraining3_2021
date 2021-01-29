package unit6_javalibraries;

import java.util.stream.IntStream;

public class StringTest {
	public static void main(String[] args) {
		//Declare		
		String str1 = "abc";
		
		byte barray []= {'a','b','c','d','e','f','g','h','i','j','k','l'};
		char chararray []= {'a','b','c','d','e','f','g','h','i','j','k','l'};
		
		String str2 = new String(barray);
		
		//String(char[] value, int offset, int count)
		String str3 = new String(barray, 2, 3);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//char	charAt(int index)
		System.out.println(str1.charAt(0));
		//System.out.println(str1.charAt(5));
		//System.out.println(str1.charAt(200)); // java.lang.StringIndexOutOfBoundsException
		
		//int	codePointAt(int index)
		System.out.println(str1.codePointAt(0)); //ASCII code of character of 0th index
		System.out.println((int)'W'); //ASCII Code of W
		
		//int	codePointBefore(int index)
		//IntStream	codePoints()
		IntStream is = str1.codePoints();
		System.out.println(is.sum());
		
		//int	compareTo(String anotherString)
		//int	compareToIgnoreCase(String str)
		String str4 = "kathmandu";
		String str5 = "Kathmandu";
		
		int result2 = str4.compareTo(str5);
		System.out.println(result2);//0-equqls
		
		int result3 = str4.compareToIgnoreCase(str5);
		System.out.println(result3);//0-equqls
		
		//String	concat(String str)
		String str6 = str4.concat(str5);
		System.out.println(str6);
		
		//boolean	contains(CharSequence s)		
		String str7 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		boolean result4 = str7.contains("the");
		System.out.println(result4);
						
		//static String	copyValueOf(char[] data)
		//static String	copyValueOf(char[] data, int offset, int count)
		
		String str8="";
		str8 = str8.copyValueOf(chararray, 0, 3);
		System.out.println(str8);
		
		//boolean	endsWith(String suffix)
		
		String str9 ="Kathmandu, Nepal";
		boolean result5 = str9.endsWith("N");
		System.out.println(result5);
		
				
		//boolean	equals(Object anObject)
		//boolean	equalsIgnoreCase(String anotherString)
		
		String str10 = "Nepal";
		String str11 = "nepal";
		
		boolean result6 = str10.equals(str11);
		System.out.println(result6);
		
		result6 = str10.equalsIgnoreCase(str11);
		System.out.println(result6);
		
		//byte[]	getBytes()
		//void	getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin)
		
		byte bytearray2[];
		bytearray2 = str7.getBytes();
		System.out.println(bytearray2);
		for(int i : bytearray2) {
			System.out.print((char)i);
		}
		System.out.println();
		
		/*		
		void	getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		int	hashCode() # Numeric Representation of Object
		*/
		
		//int	indexOf(int ch)
		//int	indexOf(int ch, int fromIndex)
		str10 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
		int res1 = str10.indexOf('e');
		System.out.println(res1);
		res1 = str10.indexOf('e', res1+1);
		System.out.println(res1);		
		//System.out.println(str10.length());
		
		//int	lastIndexOf(int ch)
		//int	lastIndexOf(int ch, int fromIndex)
		res1 = str10.lastIndexOf('e');
		System.out.println("Last "+res1);		
		
		//int	indexOf(String str)
		//int	indexOf(String str, int fromIndex)
		
		res1 = str10.indexOf("the");
		System.out.println(res1);//36
		
		res1 = str10.indexOf("the", res1+3); //36+3 = 39
		System.out.println(res1);
		
		// int	lastIndexOf(String str)
		// int	lastIndexOf(String str, int fromIndex)						
		
		//boolean	isBlank()
		//boolean	isEmpty()
		String str12=" ";
		boolean result7 = str12.isBlank();//Whitespace
		System.out.println(result7);
		result7 = str12.isEmpty(); //none printable chars
		System.out.println(result7);
		
		//int	length()
		int length = str7.length();
		System.out.println(length);
		
		str7="Balaju, \nKathmandu, \nNepal";
		//Stream<String>	lines()
		System.out.println(str7.lines().count());
		
		//String	replace(char oldChar, char newChar)
		//boolean	startsWith(String prefix)
		//boolean	startsWith(String prefix, int toffset)

		
		//String	strip()//Removes whits spaces
		//String	stripIndent()
		//String	stripLeading()
		//String	stripTrailing()
		//String	trim()
		
		str7 =" Kathamdnu\tNepal ";
				
		//char[]	toCharArray()
		//String	toLowerCase()		
		//String	toUpperCase()
		
		//String	toString()
		//static String	valueOf(int i)
		
		int n = 20;
		str7 = str7.valueOf(n); //int to String
		System.out.println(str7);				
	}
}