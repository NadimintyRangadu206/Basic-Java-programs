package com.filehandliing.concept;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = scanner.nextInt();

		System.out.println("Enter a choice");

		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			if (number % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd number");
			}
			break;
		default:
			System.out.println("invalid Number");
			break;
		}

	}

}
