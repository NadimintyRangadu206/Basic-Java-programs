package com.basic.methods;


class WithRecursion{
	long fct(int no) {
		long result;
		if(no==1) return 1;
		result=fct(no-1)*no;
		return result;
	}
}
// write a program to find factorial value without using recursion.
public class Recursion {

	static long factorial(int num) {
		
		long fact=1;
		while(num>0) {
			fact=fact*num;
			num--;
		}
		return fact;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Display the 5 factorials:"+"\n"+Recursion.factorial(5));
		
		WithRecursion r=new WithRecursion();
		long x=r.fct(5);
		System.out.println(x);
	}
}
