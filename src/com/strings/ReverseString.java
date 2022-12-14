package com.strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		
//		reverse character
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		
		System.out.println(ch);
		int count=0;
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}

		System.out.println();
		
		// reverse words
	
		String [] s1=str.split(" ");
		String reverse=" ";
		for(int j=0;j<s1.length;j++) {
			reverse=reverse+new StringBuilder(s1[j]).reverse().toString().trim()+" ";
		}
		System.out.println(reverse);
	}
}
