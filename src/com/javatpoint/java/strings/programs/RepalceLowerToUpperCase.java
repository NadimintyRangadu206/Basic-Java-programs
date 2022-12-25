package com.javatpoint.java.strings.programs;

import java.util.Scanner;

public class RepalceLowerToUpperCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");

		String str = sc.nextLine();

		// System.out.println(str);

		String lowerCase = " ";
		String upperCase = " ";
		int lCount = 0;
		int uCount = 0;
		String clower = " ";
		String cupper = " ";
		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				upperCase += ch[i];
				clower = upperCase.toLowerCase();
				uCount++;
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				lowerCase += ch[i];
				cupper = lowerCase.toUpperCase();
				lCount++;
			} else {
				System.out.println("No case is Matching!");
			}
		}
		System.out.println(clower);
		System.out.println(uCount);
		System.out.println();
		System.out.println(lowerCase);
		System.out.println(lCount);

		// defferent way of ApproachS
//		for (int j = 0; j < ch.length; j++) {
//
//			if (ch[j] >= 'A' && ch[j] <= 'Z') {
//				ch[j] += 32;
//
//			} else if (ch[j] >= 'a' && ch[j] <= 'z') {
//				lowerCase = ch[j] -= 32;
//			}
//		}
//		System.out.println(ch);

	}

}
