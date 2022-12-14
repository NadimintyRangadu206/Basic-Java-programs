package com.example.javatpoint.arrays;

public class Print3rdLargestNumber {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[] { 222, 444, 355, 432, 899, 675, 999, 234 };

		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > largest) {
					largest=arr[i];
				}
			}
		}
		System.out.println(largest);
	}

}
