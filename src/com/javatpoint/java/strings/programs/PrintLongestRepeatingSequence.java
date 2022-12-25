package com.javatpoint.java.strings.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintLongestRepeatingSequence {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String:");
		String s1=br.readLine();
		
		int size=s1.length();
		System.out.println(size);
		String splitString[]=s1.split(" ");
	
		for (int i = 0; i < splitString.length; i++) {
			for (int j = 0; j < splitString.length; j++) {
				 if(splitString[i]==splitString[j]) {;
				 System.out.println(splitString[j]+" ");
				 }
				
			}
			
		}
		
	}

}
