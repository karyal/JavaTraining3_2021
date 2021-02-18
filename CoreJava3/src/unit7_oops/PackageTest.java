package unit7_oops;

import libs.MyFunctions; //Import package.subpackage.ClassName

public class PackageTest {
	public static void main(String[] args) {
		
		MyFunctions.print("Hello"); //Static Function
		
		MyFunctions f=new MyFunctions();
		f.print(0); //Non-Static Function
	}
}