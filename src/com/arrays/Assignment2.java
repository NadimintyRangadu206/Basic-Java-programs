package com.arrays;

public class Assignment2 {

	public static void main(String[] args) {

		String[] items = { "coffee", "chai" };
		String[] liquid = { "milk", "water" ,"coke" };

		String mix[] =new String[5];
		mix[0]=items[0];
		mix[1]=items[1];
		mix[2]=liquid[0];
		mix[3]=liquid[1];
		mix[4]=liquid[2];
		
		for(int i =0;i<mix.length;i++) {
		System.out.print(mix[i]+"\t");
		}
	}

}
