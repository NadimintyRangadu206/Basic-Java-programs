package com.example.javatpoint.arrays;

public class PrintOddAndEvenNumbers {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[] { 1, 2, 3, 6, 9, 4, 5, 7, 8, 10 };

		System.out.println("Even number");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}

		}
		System.out.println();
		System.out.println("Odd numbers");
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 != 0) {
				System.out.print(arr[j] + " ");
			}

		}

	}

}
