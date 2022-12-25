package com.javatpoint.java.strings.programs;

import java.util.Scanner;

public class PrintPalindrom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		
		String temp=" ";
		String reverse=" ";
		
		char ch[] =str.toCharArray();
		
		for (int i = str.length()-1; i >= 0 ;i--) {
			reverse+=str.charAt(i);
			reverse.trim();
		}
		if(reverse==str) {
			System.out.println("Given String is Palindrom");
		}else {
			System.out.println("Given String Not Palindrom");
		}
	}

}
