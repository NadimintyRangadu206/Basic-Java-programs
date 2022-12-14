package com.interview.questions;

public class Swapping2Nos {

	int a=10;
	int b=20;
	
	public void swap() {
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println("Afetr swapping 2 values:"+" "+a+" "+b);
	}
	public static void main(String[] args) {
             
		Swapping2Nos copy= new Swapping2Nos();
		copy.swap();
	}

}
