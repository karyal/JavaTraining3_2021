package unit6_javalibraries;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStreamReaderBufferedReaderTest {

	public static void main(String[] args) {
		System.out.print("Enter you name : ");
		String name = readString();
		System.out.println("Your name : "+name);
	}
	
	//Reading String from Keyboard
	public static String readString() {
		String tmp_str="";
		try {
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			tmp_str = br.readLine();			
		}
		catch(Exception ex) {
			tmp_str="";
			System.out.println("Error : "+ex.getMessage());				
		}
		return tmp_str;
	}
}