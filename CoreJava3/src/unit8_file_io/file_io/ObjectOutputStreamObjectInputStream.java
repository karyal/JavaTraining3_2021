package unit8_file_io.file_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	String name;
	String address;
	
	@Override
	public String toString() {
		return this.name+", "+this.address;
	}
}

public class ObjectOutputStreamObjectInputStream {
	final String FILE_NAME = "data5.txt";
	
	public void write(Person p) throws FileNotFoundException, IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(new File(FILE_NAME));
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(p);
		objectOutputStream.close();
	}
	
	public void read() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(new File(FILE_NAME));
		ObjectInputStream objectInputStream  = new ObjectInputStream (fileInputStream);
		Person p1 = (Person) objectInputStream.readObject();
		System.out.println(p1);
	}
	
	public static void main(String[] args)  throws FileNotFoundException, IOException, ClassNotFoundException, NotSerializableException {
		Person p = new Person();
		p.name="Krishna";
		p.address="Kathmandu";
		new ObjectOutputStreamObjectInputStream().write(p);
		new ObjectOutputStreamObjectInputStream().read();
	}
}
