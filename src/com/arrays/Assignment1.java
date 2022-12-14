package com.arrays;

public class Assignment1 {

	public static void main(String[] args) {

		int sum = 0;
		int aveage = 0;
		int numbers[] = { 2, 5, 3, 9, 6 };
		for (int i = 0; i < numbers.length; i++) {

			sum = sum + numbers[i];

		}
		System.out.println(sum);
		aveage = sum / numbers.length;
		System.out.println(aveage);
	}

}
