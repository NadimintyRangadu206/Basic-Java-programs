package com.strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s1 = scanner.nextLine();

		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			System.out.print(s1.charAt(i) + " ");
			count++;
		}
		System.out.println(count);
		System.out.println();

		String[] arr1 = { "world", "java", "dog" };
		int size = 0;
		for (String string : arr1) {
			System.out.println(string + " ");
			size++;
		}
		System.out.println(size);

		String str = Arrays.toString(s1.split(" "));
		int l = 0;

		System.out.println(str);

		StringTokenizer st = new StringTokenizer(str);

		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken());
			l++;
		}
		System.out.println();
		System.out.println(l++);
	}

}
