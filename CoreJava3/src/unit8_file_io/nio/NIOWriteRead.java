package unit8_file_io.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class NIOWriteRead {	
	final String FILE_NAME = "data6.txt";
	final Path FILE = Paths.get(FILE_NAME);
	
	public void write(String str) throws IOException{
		//Files.write(FILE_NAME, str.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		Files.write(FILE, str.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);	
	}
	
	public void read() throws IOException{
		String str = "";
		List<String> list = Files.readAllLines(FILE);
		for(String line : list) {
			System.out.print(line);
		}
	}
	
	public static void main(String[] args) throws IOException{
		String str = "Java will read all input as a stream of bytes. The InputStream class is the superclass of all classes representing an input stream of bytes.";
		new NIOWriteRead().write(str);
		new NIOWriteRead().read();		
	}
}