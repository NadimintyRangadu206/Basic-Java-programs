package com.interview.questions;

import java.util.Scanner;

public class UniqueCharacter {

	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String:");
		String str= sc.next();
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=1;j<ch.length;j++) {
				if(ch[i]!=ch[j]) {
					System.out.println(ch[j]);
				}
			}
		}
		
	}

}
