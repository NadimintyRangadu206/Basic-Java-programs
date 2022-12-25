package com.javatpoint.java.strings.programs;

import java.util.Scanner;

public class PrintConsonantsAndVoewls {

	int conutVowels = 0;
	int countConsonants = 0;

	public String printVowelAndConsonants(String s1) {
		for (int j = 0; j < s1.length(); j++) {
			if ((s1.charAt(j)) == 'A' || (s1.charAt(j)) == 'E' || (s1.charAt(j)) == 'I' || (s1.charAt(j)) == 'O'
					|| (s1.charAt(j)) == 'E') {
				System.out.println(s1.charAt(j));
				conutVowels++;
				
			} else if ((s1.charAt(j)) >= 'A' && (s1.charAt(j)) <= 'Z') {
				System.out.println(s1.charAt(j));
				countConsonants++;
			}

		}
		return " ";

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		PrintConsonantsAndVoewls t = new PrintConsonantsAndVoewls();
		System.out.println(t.printVowelAndConsonants(str));
		System.out.println(t.conutVowels);
		System.out.println(t.countConsonants);
	}
}
