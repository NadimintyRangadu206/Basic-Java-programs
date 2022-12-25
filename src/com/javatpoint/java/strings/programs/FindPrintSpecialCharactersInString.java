package com.javatpoint.java.strings.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPrintSpecialCharactersInString {

	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String:");
		String s1 = br.readLine();
		
		int count=0;
		for (int i = 0; i < s1.length(); i++) {
			if((s1.charAt(i)=='!')||(s1.charAt(i)=='$')||(s1.charAt(i)=='*')||(s1.charAt(i)=='@')||(s1.charAt(i)=='*')||(s1.charAt(i)=='?')) {
				System.out.println(s1.charAt(i));
				count++;
			}
		}
		System.out.println(count);
	}
}
