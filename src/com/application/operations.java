package com.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class operations {

	public static void main(String[] args) {
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String: ");
		String st=sc.next();
		int count=0;
		char ch[]=st.toCharArray();
		int length=st.length();
		System.out.println("String Length:"+length);
		for(int i=1;i<length; i++) {
			for(int j=i+1; j<length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
					count++;
					break;
				}
			}
		}
		
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		int data = 10;
		System.out.println("print data" + "=" + (data << 2)); // left shift operator (10*2^2)
		System.out.println("print data" + "=" + (data >> 2));// Right shift operator (10/2^2)

		// print first ten numbers:

		for (int i = 1; i <= 10; i++) {
			System.out.println("print  first 10 elements" + "=" + i);
			break;
		}
		for (int i = 10; i >= 1; i--) {
			System.out.println("Reverse 10 to 1 numbers " + "=" + i);
		}

		String str = "Hello world";

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		System.out.println("Reverse String");

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i) + "=" + i);
		}

		
		long lg=0;
		while(lg<100) {
			System.out.println("print the lg numbers:"+lg);
			lg++;
		}
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("ncsdhdfu");
		list.add("sdnfcedf");
		list.add("mxncjshdf");
		list.add("pewpke");
		System.out.println("length of the list " + "=" + list.size());
		System.out.println(list.indexOf(list));
		for (String s : list) {
			System.out.println(s);
		}
		Iterator<String> it=list.iterator();
		while (it.hasNext()) {
			System.out.println("Syscdb"+it.next());
		}

		System.out.println("for loop...............");

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}

		int[] array = { 1, 3, 5, 7, 9 };

		int sum = 0;

		for (Integer i : array) {

			sum = sum + i;
		}
		System.out.println(sum);

		int arr[] = new int[5];
		arr[1] = 10;
		arr[2] = 20;
		arr[3] = 30;
		arr[4] = 40;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (Integer i : arr) {

			System.out.println(i);
		}

//		String s1= "sdbbjnndxjsbd";
//		int count=0;
//		int length= s1.length();
//		char [] ch=s1.toCharArray();
//		System.out.println("Duplicate characters are!");
//		for(int i=0;i<length;i++) {
//			for(int j=i+1; j<length;j++) {
//				 
//				if(ch[i]==ch[j]) {
//					System.out.println(ch[j]);
//					count++;
//					break;
//				}
//			}
//		}
		
		int number=0;
		while (number+2<=100) {
			System.out.println("Numbers:"+ number);
			number+=10;
		}
		
		
		int i=0;
		do {		
			System.out.println("Do while "+i);
			i++;
			continue;
		} while(i<=10);
		
		
		
		System.out.println();
		System.out.println("Enter a number ");
		Integer in=sc.nextInt();
		String tutorials=null;
		switch(in) {
		case 1:  tutorials="java";
		break;
		case 2: tutorials="Testing";
		break;
		case 3: tutorials="QA";
		break;
		default: System.out.println(" nothing to print");
		
		}
		System.out.println(tutorials);
		
		
		
		String co="d jf jd f";
		int coun=0;
		char [] c=co.toCharArray();
		int le=co.length();
		System.out.println(le);
		for(int r=0;r<le;r++) {
			if(co.charAt(r) !=' ') {
			coun++;
			}
		}
		System.out.println("\n"+coun);
		
		System.out.println("Enter a String worlds:");
	    String s=sc.next();
	    
	    int leng=s.length();
	    int un=0;
	    for(int t=0;t<leng;t++) {
	    	
	    	if(s.charAt(t)=='!'|| s.charAt(t)=='@' || s.charAt(t)=='#' || s.charAt(t)=='$' || s.charAt(t)=='%' || s.charAt(t)=='^' || s.charAt(t)==',' || s.charAt(t)=='.'  ) {
	    		
	    		un++;
	    	}
	    }
	    System.out.println(un);
		
	    char [] cr=s.toCharArray();
	    for(char v:cr) {
	    	
	    	if(s.charAt(v)=='V') {
	    		System.out.println(v);
	    	}
	    	else {
	    		
	    	}
	    }
	}
}
