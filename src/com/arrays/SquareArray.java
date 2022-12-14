package com.arrays;

public class SquareArray {

	public static void main(String[] args) {

		int[][] arr1 = new int[3][3];
		arr1[0][0] = 2;
		arr1[0][1] = 3;
		arr1[0][2] = 5;

		arr1[1][0] = 0;
		arr1[1][1] = 1;
		arr1[1][2] = 3;

		arr1[2][0] = 1;
		arr1[2][1] = 2;
		arr1[2][2] = 4;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {

				System.out.print(arr1[i][j] * arr1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
