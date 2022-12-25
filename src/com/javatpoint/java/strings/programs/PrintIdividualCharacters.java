package com.javatpoint.java.strings.programs;

public class PrintIdividualCharacters {
public static void main(String[] args) {
	

	String str="java is programing language";
	
	char [] ch=str.toCharArray();
	
	for(char s1:ch ) {
		if(s1!=' ') {
		System.out.print(s1+" ");
		}
	}
}
}

