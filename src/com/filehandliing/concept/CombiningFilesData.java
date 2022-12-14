package com.filehandliing.concept;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CombiningFilesData {

	public static void main(String[] args) throws IOException {
		
		File file =new File("./ReadingFile.txt");
		
		System.out.println(file.createNewFile());
		
		Scanner sc= new Scanner(file);
		int count=0;
		while(sc.hasNextLine()) {
			
			System.out.println(count++);
			System.out.println(count+++" "+sc.nextLine());
		}
		
	
	}

}
