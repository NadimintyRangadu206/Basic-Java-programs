package com.arrays;

public class TransportMatrix {

	public static void main(String[] args) {

		int[][] arr1 = new int[][] { {}, {}, {} };
		arr1[0] = new int[] { 1, 8, 9 };
		arr1[1] = new int[] { 9, 7, 2 };
		arr1[2] = new int[] { 7, 6, 4 };

		int[][] arr2 = new int[][] { {}, {}, {} };
		arr2[0] = new int[] { 1, 6, 8 };
		arr2[1] = new int[] { 0, 7, 3 };
		arr2[2] = new int[] { 1, 6, 4 };
		int arr3[][] = new int[3][3];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				// System.out.print(arr1[j][i] + " \t");
				System.out.print(arr1[j][i] * arr1[j][i] + " ");
			}
			System.out.println();
		}

		int sum = 0;
		int size = 0;
		for (int[] r : arr1) {
			for (int s : r) {
				sum += s;
				System.out.print(s + " ");
				size++;
			}
			System.out.println();
		}

		System.out.println(sum);
		System.out.println(size);
		
		
		
	}

}
