package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a String:");
		String s1=scanner.nextLine();
	
		char ch[]=s1.toCharArray();
		int size=ch.length;
		System.out.println(size);
		int count=0;
		for(int i=0;i<size;i++) {
			count++;
			System.out.print(s1.charAt(i)+" ");
		}
		System.out.println();
		System.out.println(count);
		
		System.out.println(Arrays.toString(ch));// another way
	}

}
