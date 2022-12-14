package com.strings;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();

		System.out.println(str);
		char ch[]= str.toCharArray();
		int count=0;
		int max=ch[0];
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				
				if((ch[i]==ch[j])) {
					
					System.out.println(ch[j]);
					if(ch[j]>max) {
						count++;
					}
				}
					
					
				
			}
		}
		System.out.println(count);
	}

}
