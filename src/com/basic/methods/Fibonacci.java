package com.basic.methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int count = 0;
		int f1 = 0;
		System.out.println(f1);
		int f2 = 1;
		System.out.println(f2);
		int f3 = 0;
		for (int i = 1; i < 5; i++) {

			f3 = f1 + f2;
			System.out.println(f3);
			f1 = f2;
			f2 = f3;

		}
//		while (f3 < 5) {
//
//			f3 = f1 + f2;
//			System.out.println(f3);
//			count++;
//			f1 = f2;
//			f2 = f3;
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 value:");
		int n1 = sc.nextInt();
		System.out.println("Enter n2 value:");
		int n2 = sc.nextInt();
		int n3;
		for (int n = 1; n <= 10; n++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter r1 value:");
		int r1 = Integer.parseInt(br.readLine());
		System.out.println("Enter r2 value:");
		int r2 = Integer.parseInt(br.readLine());
		int r3;
		for (int r = 1; r <= 10; r++) {
			r3 = r1 + r2;
			System.out.println(r3);
			r1 = r2;
			r2 = r3;
		}
	}
}
