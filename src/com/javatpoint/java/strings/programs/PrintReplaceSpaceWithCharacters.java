package com.javatpoint.java.strings.programs;

import java.util.Scanner;

public class PrintReplaceSpaceWithCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				System.out.print("-");
			} else if (ch[i] != ' ') {
				System.out.print(ch[i]);
			}else {
				System.out.println("No Matches!");
			}
		}

	}

}
