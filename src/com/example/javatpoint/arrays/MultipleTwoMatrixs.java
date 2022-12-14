package com.example.javatpoint.arrays;

public class MultipleTwoMatrixs {

	public static void main(String[] args) {

		System.out.println("first matrix" + "\n");
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Second matrix" + "\n");

		int[][] arr2 = { { 11, 12, 13 }, { 14, 15, 16 }, { 17, 18, 19 } };

		for (int p = 0; p < arr2.length; p++) {
			for (int q = 0; q < arr2[p].length; q++) {
				System.out.print(arr2[p][q] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Multiple two matrix");

		for (int t = 0; t < arr1.length; t++) {
			for (int s = 0; s < arr2.length; s++) {
				System.out.print(arr1[t][s] * arr2[t][s] + " ");
			}

			System.out.println();
		}
	}

}
