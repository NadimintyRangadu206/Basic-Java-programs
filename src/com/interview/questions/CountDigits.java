package com.interview.questions;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
	long no= sc.nextLong();
	
	int count=0;
	for(int i=0;i<=no;i++) {
		if(no!=0) {
		no=no/10;
		count++;
		}
	}
System.out.println(count);
	}

}
