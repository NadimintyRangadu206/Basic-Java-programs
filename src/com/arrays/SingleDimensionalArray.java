package com.arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		int [] k= {2,4}; // one way
		
		int [] f=new int[] {45,78,90};// another way
		
		int sum = 0;
		int[] i = new int[5];
		i[0] = 10;
		i[1] = 30;
		i[2] = 50;
		i[3] = 20;
		i[4] = 60;

		System.out.println(i[4]);

		for (int j = 0; j < i.length; j++) {
			sum = sum + i[j];
			// System.out.print(i[j]+",");
		}
		System.out.println(sum);

		// while loop using
		int j = 0;
		while (j < i.length) {
			System.out.println(i[j]);
			j++;
		}
	}

}
