package com.example.javatpoint.arrays;

public class PrintDuplicateElements {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[] { 20, 20, 50, 20, 60, 20 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
