package com.example.javatpoint.arrays;

public class PrintLargestElement {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println(max);

		System.out.println();

		for (int j = 0; j < arr.length; j++) {

			if (arr[j] < min) {
				min = arr[j];
			}
		}
		System.out.println(min);

	}

}
