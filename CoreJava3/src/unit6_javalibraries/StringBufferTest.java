package unit6_javalibraries;

public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBuffer stbr1 = new StringBuffer();
		
		StringBuffer stbr2 = new StringBuffer(50);
		
		CharSequence chsq = new String("Kathmandu");
		
		StringBuffer stbr3 = new StringBuffer(chsq);
		
		StringBuffer stbr4 = new StringBuffer("Kathmandu");
		
		//Functions
		//StringBuffer	append(boolean b)
		stbr4.append("true");
		stbr4.append(true);
		stbr4.append(false);
		System.out.println(stbr4);
		
		
		//void	getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)		
		StringBuffer strb5 = new StringBuffer("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		char chars[]=new char[strb5.length()];
		
		System.out.println(strb5.length());		
		strb5.getChars(0, strb5.length()-1, chars, 0);		
		for(int i=0; i<chars.length; i++) {
			System.out.print(chars[i]);
		}
		System.out.println();
		
		
		
		

	}

}
