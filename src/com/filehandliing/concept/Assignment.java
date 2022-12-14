package com.filehandliing.concept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.stream.Stream;

public class Assignment {

	public static void main(String[] args) throws IOException {

		File file = new File("./sample.txt");

		if (!file.exists()) {
			if (file.createNewFile()) {
				System.out.println("File is created Successfully...");
			}
		} else {
			System.out.println("File already exist");
		}

		FileReader fr = new FileReader(file);
		int i;
		int count = 0;
		String text = new String();
		while ((i = fr.read()) != -1) {
			text += String.valueOf((char) i);
		}
		System.out.print(text);
	
		System.out.println();
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine()) {
			
			System.out.print(count+++" "+sc.nextLine()+"\n");	
			Stream<MatchResult> str;
			 
		}
	}

}
