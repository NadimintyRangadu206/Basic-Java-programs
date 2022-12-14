package com.example.javatpoint.arrays;

public class PrintSumOfArrayElements {

	public static void main(String[] args) {
		
		int arr[];
		arr= new int[]{12,45,76,89,10,60,30,70,49,20};
		
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
