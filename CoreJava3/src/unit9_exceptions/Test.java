package unit9_exceptions;

//How to handle run-time exceptions (errors)
public class Test {
	
	public static void main(String[] args) {
		int x,y,z;
		try {
			x = 5; //Read from Keyboard
			y = 3; //Read from Keyboard
			z = x/y;
			System.out.println("Result : "+z);
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		finally {
			System.out.println("Finally Block");
		}
	}
}