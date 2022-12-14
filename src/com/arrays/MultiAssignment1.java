package com.arrays;

public class MultiAssignment1 {

	public static void main(String[] args) {

		int[][] arr1 = new int[][] { {}, {}, {} };
		arr1[0] = new int[] { 1, 8, 9 };
		arr1[1] = new int[] { 9, 7, 2 };
		arr1[2] = new int[] { 7, 6, 4 };

		int[][] arr2 = new int[][] { {}, {}, {} };
		arr2[0] = new int[] { 2, 6, 8 };
		arr2[1] = new int[] { 0, 1, 3 };
		arr2[2] = new int[] { 1, 2, 4 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {

				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\n");

		for (int r = 0; r < arr2.length; r++) {
			for (int s = 0; s < arr2[r].length; s++) {

				System.out.print(arr2[r][s] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		System.out.println("Adding two marix's in Single output");

		int[][] arr3 = new int[3][3];
		int sum = 0;

		for (int t = 0; t < arr1.length; t++) {

			for (int p = 0; p < arr2.length; p++) {
				arr3[t][p] = arr1[t][p] + arr2[t][p];

				System.out.print(arr3[t][p] + " ");
				sum = sum + arr3[t][p];

			}

			System.out.println();
		}
		System.out.println(sum);
		
		
		
		
	}

}
