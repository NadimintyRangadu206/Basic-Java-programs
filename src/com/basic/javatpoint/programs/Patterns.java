package com.basic.javatpoint.programs;

public class Patterns {

	public static void main(String[] args) {

		for (int i = 1; i <=5; i++) {
	      for(int j=1;j<i;j++) {
	    	System.out.print(j+" ");
	      }
	      System.out.println();
		}
		
		
		System.out.println();
		
		for (int k = 1; k < 5; k++) {
			for (int r = 5-k; r >1 ; r--) {
				System.out.print("  ");
			}
			for (int m = 1; m < k; m++) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}

}
