package com.arrays;

public class Assignment5 {

	public static void main(String[] args) {

		int[][] arr1 = new int[][] { {}, {}, {} };
		arr1[0] = new int[] { 1, 8, 9 };
		arr1[1] = new int[] { 9, 7, 2 };
		arr1[2] = new int[] { 7, 6, 4 };

		int[][] arr2 = new int[][] { {}, {}, {} };
		arr2[0] = new int[] { 1, 6, 8 };
		arr2[1] = new int[] { 0, 7, 3 };
		arr2[2] = new int[] { 1, 6, 4 };

		int arr3[][] = new int[3][3]; // this one is adding two arrays and print one single array.

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
//				arr3[i][j] = arr1[i][j] + arr2[i][j];
//				System.out.print(arr3[i][j] + " ");
				if(arr1[i][j]==arr2[i][j]) {
					System.out.print("1"+" ");
				}else {
					System.out.print("0"+" ");
				}
			}

			System.out.println();
		}

	}

}
