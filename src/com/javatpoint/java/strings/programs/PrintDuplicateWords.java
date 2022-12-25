package com.javatpoint.java.strings.programs;

import java.util.Scanner;

public class PrintDuplicateWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();

		String s1[] = str.split(" ");
		int count;

		for (int i = 0; i < s1.length; i++) {
			count = 1;
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i].equals(s1[j])) {
					count++;
					// s1[j]="0";
				}
			}

			if (count > 2 && s1[i] != "0") {
				System.out.print(i+"-"+s1[i] + " ");
			}
		}

		
		
		
	}

}
