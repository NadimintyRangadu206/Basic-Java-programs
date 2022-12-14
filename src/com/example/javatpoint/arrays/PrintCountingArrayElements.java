package com.example.javatpoint.arrays;

public class PrintCountingArrayElements {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[] { 10, 45, 70, 30, 20, 11, 33, 65, 30, 22 };

		int length=arr.length;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
		}
		System.out.println(count);
		System.out.println(length);
	}

}
