package unit11_networking;

import java.net.*;

public class InetTest {

	public static void main(String[] args) throws UnknownHostException {
		
		// Returns the system details
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address); //DESKTOP-PUT87J0/192.168.0.102
		
		// Returns the address of the website
		address = InetAddress.getByName("www.facebook.com"); 
		System.out.println(address); //www.facebook.com/157.240.198.35
		
		InetAddress ia[] = InetAddress.getAllByName("www.google.com");
		for(int i=0; i< ia.length; i++){
			System.out.println(ia[i]);
		}
		//www.google.com/172.217.166.36
		
	}

}
