package unit8_file_io.file_management;

import java.io.File;
import java.io.IOException;

public class FileManagement {
	
	static String FILE_NAME = "data0.txt";
	
	public static void f1() throws IOException {
		//File Object Initialization
		File file = new File(FILE_NAME);
		
		//Creating new File
		if(file.exists()) {
			System.out.println("File already exist.");
		}
		else {
			boolean result = file.createNewFile();		
			if (result) {
				System.out.println("File create successfully");
			}
			else {
				System.out.println("Can't create file");
			}
		}
		//File Rename?
		//File Delete?
		//File Copy/Move?
	}
	
	public static void f2() {
		File f = new File("D:/");
		if (f.isDirectory()) {
			File [] files =  f.listFiles();
			int count = 0;
			for(File item : files) {
				String file_name = String.format("%30s", item.getName());				
				String file_type = "Dir";
				String file_size = "";
				String date_time = "";
				if (item.isFile()) {
					file_type ="File";
					Long tmp_size = item.length();
					if (tmp_size>0 && tmp_size<1024) {
						file_size = tmp_size+" BY";
					}	
					else if(tmp_size>1024 && tmp_size<1024*1024) {
						file_size = tmp_size/(1024)+" KB";
					}
					else if(tmp_size>1024*1024 && tmp_size<1024*1024*1024) {
						file_size = tmp_size/(1024*1024)+" MB";
					}
					else if(tmp_size>1024*1024*1024 && tmp_size<1024*1024*1024*1024) {
						file_size = tmp_size/(1024*1024*1042)+" GB";
					}
					else if(tmp_size>1024*1024*1024*1024 && tmp_size<1024*1024*1024*1024*1024) {
						file_size = tmp_size/(1024*1024*1042*1024)+" TB";
					}
					else {						
						file_size = "NA";						
					}
					Long  last_modified = item.lastModified();
					date_time = libs.Functions.convertTime(last_modified);					
				}
				System.out.println(++count+"\t"+file_name+"\t"+file_type+"\t"+file_size+"\t"+date_time);
			}		
		}
	}
	public static void main(String[] args) throws IOException {		
		f1();
	}	
}