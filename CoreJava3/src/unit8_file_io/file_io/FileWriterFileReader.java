package unit8_file_io.file_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterFileReader {
	final String FILE_NAME = "data1.txt";
	
	public void FileWriterTest(String str) throws IOException{
		FileWriter writer = new FileWriter(FILE_NAME);
		writer.write(str);
		writer.close();
	}
	public void FileReaderTest() throws IOException{
		FileReader reader= new FileReader(FILE_NAME);
		int n=0;
		while((n = reader.read())!=-1) {
			System.out.print((char)n);
		}
		System.out.println();
		reader.close();
	}
	public static void main(String[] args) throws IOException{
		String str1 ="Java.io class package includes almost all operations of input and output needs. All of these stream classes represent the input source and output destination.\r\n"
				+ "\r\n"
				+ "Java.io package streaming support a variety of formats, such as: basic types, objects, localized character sets and so on.\r\n"
				+ "\r\n"
				+ "It can be understood as a sequence of a stream of data. Represents the input stream to read data from a source to a target output stream represents write data.\r\n"
				+ "\r\n"
				+ "Java provides a powerful and flexible support for I / O, making it more widely used in file transfers and network programming.\r\n"
				+ "\r\n"
				+ "However, this section describes the most basic and stream I / O related functions. We will learn through an example to these functions.";
		new FileWriterFileReader().FileWriterTest(str1);				
		new FileWriterFileReader().FileReaderTest();
	}
}
