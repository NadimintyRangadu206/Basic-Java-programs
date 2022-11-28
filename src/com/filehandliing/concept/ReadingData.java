package com.filehandliing.concept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadingData {

	public static void main(String[] args) throws IOException {

		File file = new File("./ReadingFile.txt");
		if (!file.exists() && file.createNewFile()) {
			System.out.println("file is created.");
		} else {
			System.out.println("already file is exists.");
		}

		FileInputStream fis = new FileInputStream(file);
		int i;
		String str = new String();
		while ((i = fis.read()) != -1) {
			str += String.valueOf((char) i);
//		System.out.print((char)i);
		}
		System.out.println("\n");
		System.out.print(str);

		System.out.println("\n");

		// Using Scanner :

		String text = new String();
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			text += sc.nextLine() + "\n";

		}
		System.out.println(text);

		// using Another way using FileReader:

		FileReader fr = new FileReader(file);

		int index;
		String s = new String();
		while ((index = fr.read()) != -1) {
			s += String.valueOf((char) index);
//		System.out.print((char)i);
		}
		System.out.println("\n");
		System.out.print(s);

		// using another way BufferReader:
		
		BufferedReader br= new BufferedReader(new InputStreamReader(fis));
		String convert;
		while((convert=br.readLine())!=null) {
			System.out.println(convert+"file");
		}
		
		
		sc.close();
		fis.close();
		fr.close();
	}
}
