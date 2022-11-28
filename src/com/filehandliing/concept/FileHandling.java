package com.filehandliing.concept;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		File file= new File("E:\\FirstFile.txt");
		if(file.exists() && file.delete()) {
			System.out.println("File Exist and Deleted");
		if(file.createNewFile()) {
			System.out.println("File is created Successfully");
		}else {
			System.out.println("File already is Exist!");
		}

	}
		
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getCanonicalPath());
		System.out.println(file.isDirectory());
		System.out.println(file.listFiles());
	}
}
