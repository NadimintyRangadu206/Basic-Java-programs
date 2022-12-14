package com.arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		// int [][] arr={{1,8,9},{9,7,2},{7,6,4}} creating array

		// int [][] arr= new int[][] {{},{},{}};
		// arr[0]= new int[]{1,8,9};
		// arr[1]=new int[]{9,7,2};
		// arr[2]= new int[]{7,6,4};

		int[][] arr = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 8;
		arr[0][2] = 4;

		arr[1][0] = 9;
		arr[1][1] = 7;
		arr[1][2] = 2;

		arr[2][0] = 7;
		arr[2][1] = 6;
		arr[2][2] = 4;

		// form matrix and print the sum of the total elements.

		// one way doing
		int sum = 0;
		// for (int i = 0; i < arr.length; i++) {
		// int row[] = arr[i];
		// for (int j = 0; j < row.length; j++) {
		// System.out.print(row[j] + " ");
		// sum = sum + row[j];
		// }
		// System.out.println();
		//
		// }
		// System.out.println(sum);

		// another way doing
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
				sum = sum + arr[i][j];
			}
			System.out.println();

		}
		System.out.println("Total sum of elements:" + "\n\n" + sum + "\n");

		// find the size:
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			size = size + arr[i].length;
		}
		System.out.println("Size of matrix:" + "\n" + size);

	}

}
