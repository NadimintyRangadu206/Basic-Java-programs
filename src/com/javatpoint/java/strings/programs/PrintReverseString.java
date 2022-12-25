package com.javatpoint.java.strings.programs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PrintReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();

		// another way of approach to reverse the String
		char ch[] = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

		System.out.println();
		
		StringTokenizer st = new StringTokenizer(str);
		String copy = " ";
		
		while (st.hasMoreElements()) {
			copy = st.nextToken() + " ";
			for (int i = copy.length() - 1; i >= 0; i--) {
				if (copy.split(" ") != null) {
					System.out.print(copy.charAt(i));
				}
			}
		}

	}

}
