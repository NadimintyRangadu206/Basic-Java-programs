package com.basic.javatpoint.programs;

import java.util.Scanner;

public class AsciiCodes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character:");
		char ch = sc.next().charAt(0);

		System.out.println(ch);
		int no = (int) ch;
		System.out.println(no);
		System.out.println();
		for (int i = 33; i <= 120; i++) {
			System.out.println((char) i + "=" + i);
		}

	}
}
