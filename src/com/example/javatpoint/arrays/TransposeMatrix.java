package com.example.javatpoint.arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		System.out.println("first matrix" + "\n");
		
		
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Transpose matrix");
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[j][i] + " ");
			}
			System.out.println();
		}

		System.out.println();

	}

}
