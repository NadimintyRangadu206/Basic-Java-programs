package com.javatpoint.java.number.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class ConvertNumberToWord {

	public static void main(String[] args) throws Throwable, IOException {

		System.out.println("Using Scanner class");
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int length = s.nextInt();
	      int [] myArray = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         myArray[i] = s.nextInt();
	      }

	      System.out.println(Arrays.toString(myArray));

	      
	      System.out.println("Using BufferReader class");
	      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("Enter a size");
	      int size=Integer.parseInt(br.readLine());
	      int arr[]=new int[size]; 
	      System.out.println("Enter a elements:");
	      for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
	      System.out.println(Arrays.toString(arr).toCharArray());
	      
	      
	      
	}
}
