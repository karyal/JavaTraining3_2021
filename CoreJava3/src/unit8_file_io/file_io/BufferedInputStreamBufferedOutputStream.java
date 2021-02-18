package unit8_file_io.file_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamBufferedOutputStream {	
	final String FILE_NAME = "data4.txt";	
	public void write(String str) throws FileNotFoundException, IOException{
		FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
		BufferedOutputStream bufferedOutputStream= new BufferedOutputStream(fileOutputStream);
		bufferedOutputStream.write(str.getBytes());
		bufferedOutputStream.close();
		fileOutputStream.close();		
	}
	
	public void read() throws IOException{
		FileInputStream fileInputStream= new FileInputStream(FILE_NAME);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		int ch= bufferedInputStream.read();
		String tmp="";
		while(ch!=-1) {
			tmp+=(char)ch;
			ch=bufferedInputStream.read();
		}
		bufferedInputStream.close();
		fileInputStream.close();
		System.out.println(tmp);
	}
	
	public static void main(String[] args) throws IOException {
		String str_text="Java.io class package includes almost all operations of input and output needs. All of these stream classes represent the input source and output destination.";		
		new BufferedInputStreamBufferedOutputStream().write(str_text);
		new BufferedInputStreamBufferedOutputStream().read();		
	}
}
