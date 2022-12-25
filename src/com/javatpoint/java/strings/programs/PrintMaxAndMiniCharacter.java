package com.javatpoint.java.strings.programs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PrintMaxAndMiniCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
          
		System.out.println("Display the String:");
		
		int [] arr= new int[str.length()]; // creating an array
		char ch[]=str.toCharArray();// converting string to array
		
		for (int i = 0; i < ch.length; i++) {
			arr[i]=1;
			for (int j = i+1; j < ch.length; j++) {
				
				if(ch[i]==ch[j] && ch[i]!=' ' && ch[i]!='0') {
					arr[i]++;
				}
				
			}
		}
	
		int max=0; int min=0;
		
		 char minChar = str.charAt(0), maxChar = str.charAt(0);    
		for (int i = 0; i < arr.length; i++) {
			
			if(min>arr[i]&& arr[i]!='0') {
				min=arr[i];
				minChar=ch[i];
			}
			
			else if(max < arr[i]) {    
		              max = arr[i];    
		              maxChar = ch[i];    
		          }
		}
		System.out.println(minChar);
			System.out.println(maxChar);
		
	
	
	}

}
