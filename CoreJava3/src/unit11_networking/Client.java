package unit11_networking;
import java.net.*;  
import java.io.*;

public class Client {
	// initialize socket and input output streams  
	private Socket socket = null;  
	private DataInputStream input = null;  
	private DataOutputStream out = null;
	// constructor to put ip address and port

	public Client(String address, int port){  
		try{  
			socket = new Socket(address, port); 
			System.out.println("Connected");  
			input = new DataInputStream(System.in);
			out = new DataOutputStream(socket.getOutputStream());			
		}
		catch(UnknownHostException ex) {
			System.out.println(ex.getMessage());
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		String line = "";
		while (!line.equals("Finished")) {
			try {
				line = input.readLine();  
				out.writeUTF(line);
			}
			catch(IOException ex) {
				System.out.println("Error : "+ex.getMessage());
			}
		}
		try {
			input.close(); 
			out.close();
			socket.close();
		}
		catch(IOException i) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Client client = new Client("127.0.0.1", 6000);
	}
}