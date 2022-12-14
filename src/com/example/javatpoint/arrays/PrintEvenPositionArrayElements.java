package com.example.javatpoint.arrays;

public class PrintEvenPositionArrayElements {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		System.out.println("Print even position array elements!");

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + "\t");
			}

		}
		
		
		System.out.println();

		System.out.println("Odd position array elements!");

		for (int j = 0; j < arr.length; j++) {
			if (j % 2 != 0) {
				System.out.print(arr[j] + "\t");
			}
		}
	}

}
