package com.strings;

import java.util.Scanner;

public class OddUpEvenReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s1 = sc.nextLine();
		String s2[] = s1.split(" ");
		int count = 0;
		String oddPosition=" ";
		String evenPosition=" ";
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < s2.length; i++) {
				if(i%2!=0) {
					oddPosition=oddPosition+s2[i].toString().toUpperCase()+" ";
					
				}else {
					evenPosition=evenPosition+new StringBuilder(s2[i]).reverse().toString()+" ";
				}
			
		}
		System.out.println(oddPosition);
		System.out.println(evenPosition);
		
		for (String copy : s2) {
			System.out.print(copy + "\t");
			count++;

		}
		System.out.println();
		System.out.println(count);

	}

}
