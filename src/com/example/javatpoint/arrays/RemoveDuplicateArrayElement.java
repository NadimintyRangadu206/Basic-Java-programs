package com.example.javatpoint.arrays;

public class RemoveDuplicateArrayElement {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[] { 222, 444, 355, 432, 222, 675, 999, 222 };

		int duplicate=0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {

				if(arr[i]==arr[j]){
					duplicate=arr[i];
					arr[i]=arr[j];
					arr[j]=duplicate;

				}
			}
		}
		System.out.println(duplicate);

		{
		       System.out.println('h' + 'y' + 'r');
		   }
	}

}
