package com.interview.questions;

import java.util.Scanner;

public class CovertingCharaCases {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String:");
		
		String s1=sc.next();
		
	char ch[]=s1.toCharArray();
		StringBuilder br= new StringBuilder("");
		
		String upperCon="";
		String lowerConv="";
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]>=65&& ch[i]<=90) {
				br.append((char)ch[i]+32);
			}else if(ch[i]>=97 && ch[i]<=120) {
				br.append((char)ch[i]-32);
			}else {
				System.out.println("Empty");
			}
		}
         String str=br.toString();
		System.out.println(str);
		System.out.println();
	}

}
