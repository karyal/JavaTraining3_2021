package unit8_file_io.file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamFileInputStream {
	final String FILE_NAME = "data3.txt";
	
	public void write(String str) throws FileNotFoundException, IOException{
		FileOutputStream fileOutputStram = new FileOutputStream(FILE_NAME);
		fileOutputStram.write(str.getBytes());
		fileOutputStram.close();
	}
	
	public void read() throws FileNotFoundException, IOException{
		FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
		String tmp = "";
		int ch = fileInputStream.read();
		while(ch!=-1) {
			tmp+=(char)ch;
			ch = fileInputStream.read();
		}
		fileInputStream.close();
		System.out.println(tmp);
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String str1 ="Java.io class package includes almost all operations of input and output needs. All of these stream classes represent the input source and output destination.";
		new FileOutputStreamFileInputStream().write(str1);
		new FileOutputStreamFileInputStream().read();
		
	}	
}