package com.javatpoint.java.strings.programs;

public class PrintSwapingTwoStringVariable {

	public static void main(String[] args) {
		
		String s1="java";
		
		String s2="Python";
		String s3;
		s3=s2;
		s2=s1;
		s1=s3;
	
	System.out.println(s1);
		System.out.println(s2);
	}

}
