package com.interview.questions;

public class CheckVowel {

	public static void main(String[] args) {

		String str = "Write a Java program to check if a vowel is present in a string u";

		char ch[] = str.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				
				System.out.print(ch[i] + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}

}
