package com.javatpoint.java.strings.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintSubSetStrings {

	public static void main(String[] args) throws Exception, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String:");
		String s1 = br.readLine();
		
		int size = s1.length();
		System.out.println(size);
		
		String[] subSet = new String[size * ((size + 1) / 2)];

		int temp = 0;
		String subParts = " ";
		
		for (int i = 0; i < size; i++) { // logic here
			for (int j = i; j < size; j++) {
				subParts = s1.substring(i, j + 1);
				subSet[temp] = subParts;
				temp++;
			}
		}
		for (int i = 0; i < subSet.length; i++) {
			System.out.println(subSet[i] + " ");
		}
	}

}
