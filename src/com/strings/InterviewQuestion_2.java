package com.strings;

import java.util.Scanner;

public class InterviewQuestion_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s1 = sc.nextLine();
		char ch[] = s1.toCharArray();
		String upper = " ";
		int upp=0;
		String lower = " ";
		int low=0;
		String special = "";
		int spec=0;
		String digits = " ";
		int digi=0;
		for (int i = 0; i < ch.length; i++) {

			// if (ch[i] == 'A' || ch[i] == 'B' || ch[i] == 'C' || ch[i] == 'D' || ch[i] ==
			// 'E' || ch[i] == 'F'
			// || ch[i] == 'G' || ch[i] == 'H' || ch[i] == 'I' || ch[i] == 'J' || ch[i] ==
			// 'K' || ch[i] == 'L'
			// || ch[i] == 'M' || ch[i] == 'N' || ch[i] == 'O' || ch[i] == 'P' || ch[i] ==
			// 'Q' || ch[i] == 'R'
			// || ch[i] == 'S' || ch[i] == 'T' || ch[i] == 'U' || ch[i] == 'V' || ch[i] ==
			// 'W' || ch[i] == 'X'
			// || ch[i] == 'Y' || ch[i] == 'Z') {
			//
			// upper = upper + ch[i] + " ";
			// } else if (ch[i] == 'a' || ch[i] == 'b' || ch[i] == 'c' || ch[i] == 'd' ||
			// ch[i] == 'e' || ch[i] == 'f'
			// || ch[i] == 'g' || ch[i] == 'h' || ch[i] == 'i' || ch[i] == 'j' || ch[i] ==
			// 'k' || ch[i] == 'l'
			// || ch[i] == 'm' || ch[i] == 'n' || ch[i] == 'o' || ch[i] == 'p' || ch[i] ==
			// 'q' || ch[i] == 'r'
			// || ch[i] == 's' || ch[i] == 't' || ch[i] == 'u' || ch[i] == 'v' || ch[i] ==
			// 'w' || ch[i] == 'x'
			// || ch[i] == 'y' || ch[i] == 'z') {
			// lower = lower + ch[i] + " ";
			// }
			if ((ch[i] >= 33 && ch[i] <= 47)) {
				special = special + ch[i] + " ";
				spec++;
			} else if (ch[i] >= 48 && ch[i] <= 57) {
				digits = digits + ch[i] + " ";
				digi++;
			} else if (ch[i] >= 58 && ch[i] <= 64) {

			} else if (ch[i] >= 65 && ch[i] <= 90) {
				upper = upper + ch[i] + " ";
				upp++;
			} else if (ch[i] >= 97 && ch[i] <= 120) {
				lower = lower + ch[i] + " ";
				low++;
			} else {
				System.out.println(" no one match!");
			}

		}
		System.out.println(upper);
		System.out.println(upp);
		System.out.println(lower);
		System.out.println(low);
		System.out.println(special);
		System.out.println(spec);
		System.out.println(digits);
		System.out.println(digi);
		
	}
}
