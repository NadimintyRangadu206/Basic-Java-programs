package com.basic.javatpoint.programs;

import java.util.Random;

public class CheckRandomNumbers {
int no;
	public void random() {
		double d=Math.random();
	System.out.println(d);
	no=(int)d;
	}
	public static void main(String[] args) {
		CheckRandomNumbers c=new CheckRandomNumbers();
		c.random();
		
		Random r=new Random();
		int num=r.nextInt();
		System.out.println(num);
		boolean b=r.nextBoolean();
		boolean t=r.nextBoolean();
		System.out.println(t);
		System.out.println(b);
		double e=r.nextDouble();
		System.out.println(e);
		
		
		
	}
}
