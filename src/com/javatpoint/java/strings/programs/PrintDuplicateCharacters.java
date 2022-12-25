package com.javatpoint.java.strings.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintDuplicateCharacters {

	public static void main(String[] args) throws Exception,IOException {
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String:");
		String str= br.readLine();
		
		System.out.println(str);
		
		char ch[]=str.toCharArray();
		
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
					count++;

				}
			}
			
		}
		
		System.out.println();
		System.out.println(count);
	}

}
