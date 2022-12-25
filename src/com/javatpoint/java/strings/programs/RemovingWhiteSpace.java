package com.javatpoint.java.strings.programs;

import java.util.Scanner;

public class RemovingWhiteSpace {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String:");
		
		String str=sc.nextLine();
		
		System.out.println(str);
		
		int length=str.length();
		String removeSpace[]=str.split(" ");
		for (int i = 0; i < removeSpace.length; i++) { //using  split();
			System.out.print(removeSpace[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i <length; i++) {//Using charAt()
			if((str.charAt(i))!=' ') {
				System.out.print(str.charAt(i));
			}
		}

	}

}
