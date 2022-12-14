package com.example.javatpoint.arrays;

public class AddTwoMatrixs {

	public static void main(String[] args) {

		System.out.println("First matrix");
		int arr1[][] = new int[3][3];

		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;

		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;

		arr1[2][0] = 7;
		arr1[2][1] = 8;
		arr1[2][2] = 9;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Second matrix");

		int arr2[][] = new int[3][3];

		arr2[0][0] = 11;
		arr2[0][1] = 12;
		arr2[0][2] = 13;

		arr2[1][0] = 14;
		arr2[1][1] = 15;
		arr2[1][2] = 16;

		arr2[2][0] = 17;
		arr2[2][1] = 18;
		arr2[2][2] = 19;

		for (int k = 0; k < arr2.length; k++) {
			for (int m = 0; m < arr2[k].length; m++) {
				System.out.print(arr2[k][m] + " ");
			}
			System.out.println();
		}

		System.out.println("Addition of  two matrix's");
		for (int r = 0; r < arr1.length; r++) {
			for (int s = 0; s < arr2.length; s++) {
				System.out.print(arr1[r][s] + arr2[r][s] + " ");
			}
			System.out.println();
		}

	}

}
