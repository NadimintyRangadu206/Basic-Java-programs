package com.example.javatpoint.arrays;

public class PrintAscendingOrderArray {

	public static void main(String[] args) {

		int arr[];
		arr = new int[] { 12, 45, 76, 89, 10, 60, 30, 70, 49, 20 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
