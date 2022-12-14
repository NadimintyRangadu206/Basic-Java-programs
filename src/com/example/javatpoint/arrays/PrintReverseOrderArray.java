package com.example.javatpoint.arrays;

public class PrintReverseOrderArray {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Print given array elements in order!");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Print given array elements in reverse order!");
		
		for (int j = arr.length-1; j >=0; j--) {
			System.out.println(arr[j]);
		}
	}
}
