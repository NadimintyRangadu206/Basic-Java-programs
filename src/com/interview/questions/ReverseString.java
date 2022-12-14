package com.interview.questions;

public class ReverseString {

	public static void main(String[] args) {
	
		String s1="java is object oriented programing language";
		
		String reverse=" ";
		
		String [] s2=s1.split(" ");
		
		
		for(int i=0;i<s2.length;i++) {
			reverse+=new StringBuilder(s1).reverse().toString();
		}
		System.out.println(reverse);
	}

}
