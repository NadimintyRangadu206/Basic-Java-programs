package com.strings;

public class InterviewQeustion {

	public static void main(String[] args) {
	
		String str="java is super";
		String s1=str.substring(0,4);
		String s2=str.substring(5, 7);
		String s3=	str.substring(9, 13);
		System.out.println(s1+","+s2+","+s3+",");
		char ch[] =s1.toCharArray();
		for (int i=0;i<ch.length;i++) {
			System.out.print(s1.charAt(i)+" ");
		}
		System.out.println(ch);
		System.out.println(str);
	}

}
