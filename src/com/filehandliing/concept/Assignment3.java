package com.filehandliing.concept;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a first number");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter a Second number");
		int n2 = scanner.nextInt();

		System.out.println("Enter a choice ");
		String targetOperator = scanner.next();

		switch (targetOperator) {
		case "+":
			System.out.println(n1 + n2);
			break;
		case "-":
			System.out.println(n1 - n2);
			break;
		case "*":
			System.out.println(n1 * n2);
			break;

		case "/":
			System.out.println(n1 / n2);
			break;
		case "%":
			System.out.println(n1 % n2);
		default:
			System.out.println("Invalid  target Operator!");
			break;
		}

	}

}
