package com.arrays;

public class Assignment3 {

	public static void main(String[] args) {
		
		int[] myArray = new int[]{1, 3, 8, 5, 7, };
		int max = myArray[0];
		for(int i = 0; i < myArray.length; i++) {
		      if(myArray[i] > max) {
		         max = myArray[i];
		      }
		}
		System.out.println(max);

		
		int min= myArray[4];
		for(int j=0;j<myArray.length; j++) {
			if(myArray[j] <min) {
				min=myArray[j];
			}
		}
		System.out.println(min);
		int sum=0;
		for(int value:myArray) {
			sum=sum+value;
		}
		System.out.println("Total sum:"+sum);
		String[] words= {"milk", "water" ,"coke","coffee", "chai"};
		
		String sort=words[0];
		
		for(int i=0;i<words.length;i++) {
//			if(words[i]>sort) {
//				
//			}
		}
	}

	
}
