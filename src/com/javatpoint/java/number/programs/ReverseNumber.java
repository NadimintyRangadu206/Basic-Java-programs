package com.javatpoint.java.number.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {
	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a number:");
		
		int number =Integer.parseInt(br.readLine());
		
		System.out.println(number);
		int r=0,reverse=0;
		for (int i = 1; i <=number; i++) {
			 r = number%10;
			 reverse= (reverse*10)+r;
			 number=number/10;
		}
		System.out.println(reverse);
		
		
	}
}
