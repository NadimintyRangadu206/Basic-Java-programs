package com.interview.questions;

public class CheckCondition {

	public static void main(String[] args) {
		
		int arr[]= {3, 4, 5, 1, 6, 10, 9, 7, 8};
		int size=arr.length;
		System.out.println(size);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>=arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

	}

}
