package com.javatpoint.java.strings.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintStringTwoEqualParts {

	public static void main(String[] args) throws Throwable {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String:");
		String s1 = br.readLine();
		
		int size = s1.length();
		System.out.println(size);
		
		System.out.println("Enter a limit");
		int n = Integer.parseInt(br.readLine());
		
		int chars = size / n;
		
		int temp = 0;
		
		String[] equalParts = new String[n];
		
		
		if (size % n != 0) {
			System.out.println("Divided by" + n + "EqualParts:");
		} else {
			for (int i = 0; i < s1.length(); i += chars) { // logic here

				String parts = s1.substring(i, i + chars);
				equalParts[temp] = parts;
				temp++;
			}
			System.out.println("Equal parts");
			for (int j = 0; j < equalParts.length; j++) {
				System.out.println(equalParts[j] + " ");
			}

		}

	}

}
