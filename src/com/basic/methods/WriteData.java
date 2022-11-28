package com.basic.methods;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

// this three are write the data purpose.
//FileOutputStream
//FileWriter
//BufferedWriter
public class WriteData {

	public static void main(String[] args) throws IOException {

		File file = new File("./sample.txt");
		file.createNewFile();
		
		String text=new String("Hello Hyderabad");
		FileOutputStream fos = new FileOutputStream(file);
		
		for(char ch :text.toCharArray()) {
			fos.write((int)ch);
		}
		
		
		String str="my name is Rangadu";
		FileWriter fw= new FileWriter(file);
		
		fw.write(str);
		fw.close();
		fos.flush();
		fos.close();
		
	}

}
