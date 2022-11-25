package com.basic.methods;

public class Palindrome {

	public static void main(String[] args) {

		int no = 434;
		int temp = no;
		int sum = 0;
		int r = 0;
		int count = 0;

		for (int i = 1; i <= 3; i++) { // for loop based
			r = no % 10;
			sum = (sum * 10) + r;
			no = no / 10;
		}

		while (no >= 3) { // while loop based
			r = no % 10;
			sum = (sum * 10) + r;
			no = no / 10;
			count++;
		}
		
		do {   //do while loop based 
			r = no % 10;
			sum = (sum * 10) + r;
			no = no / 10;
			count++;
		} while (no >= 3);
		
		
		if (sum == temp) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not Palindrome");
		}

	}
}
