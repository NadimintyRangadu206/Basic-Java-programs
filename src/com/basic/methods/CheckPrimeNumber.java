package com.basic.methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int no = 8;
		int count = 0;

		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				count++;
				break;
			}

		}
		if (count == 0) {
			System.out.println("number is prime number");
		} else {
			System.out.println("Not a prime number!");
		}

		// another way

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		int coun = 0;

		for (int s = 2; s < number; s++) {
			if (number % s == 0) {
				coun++;
				break;
			}
		}
		if (coun == 0) {
			System.out.println("The given number is Prime number");
		} else {
			System.out.println("The given number is  not Prime number!");
		}

		// gain Another way

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a  array Number");
		int arrrNo = Integer.parseInt(br.readLine());
	}

}
