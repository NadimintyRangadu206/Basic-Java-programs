package com.arrays;

public class FindCommonElement {

	public static void main(String[] args) {

		int[][] arr1 = new int[3][3];
		arr1[0][0] = 2;
		arr1[0][1] = 3;
		arr1[0][2] = 5;

		arr1[1][0] = 9;
		arr1[1][1] = 7;
		arr1[1][2] = 2;

		arr1[2][0] = 7;
		arr1[2][1] = 6;
		arr1[2][2] = 4;
		int duplicate=0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				 duplicate = arr1[i][j];
				for (int k = j+1; k < arr1.length; k++) {
					if (duplicate == arr1[i][k]) {
						System.out.print(duplicate);
					}
				}

			}
			System.out.println();
		}

	}

}
