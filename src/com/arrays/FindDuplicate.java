package com.arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		
		int duplicate[]=new int[] {2,6,9,5,2,6,9};
		
		int length=duplicate.length;
		
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(duplicate[i]==duplicate[j]) {
					
					System.out.println(duplicate[j]);
				}
				
			}
			
		}

	}

}
