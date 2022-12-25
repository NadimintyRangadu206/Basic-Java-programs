package com.java.lambda.expressions;

import java.util.function.Predicate;
public class Example1 {

	/**
	 * Lambda expression is anonymous function.
	 * it is implemented functional interface.
	 * function interface means, which is having only allowed single abstract method.
	 * Functional interface having some interfaces like Runnable,callable,comparator,activeListner those are having single abstract method.
	 * Functional interface having pre-defined interfaces.predicate (test()), function (apply()) ,consumer,supplier.this are all also having single abstract method.
	 */
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = a -> a * a > 20 && a * a < 50;
		System.out.println(p.test(8));
	
		
		int arr[] = { 10, 30, 40, 33, 56, 78, 33, 60, 80 };

		p = i -> i % 2 != 0 || i > 70;
		for (int no : arr) {
			if (p.test(no)) {
				System.out.println(no);
			}
		}
		
		// how to join  two or more predicates using the and or navigate.
		System.out.println();
		
		Predicate<Integer> p1=i->i%2==0;
		
		Predicate<Integer> p2=i->i>50;
		
		for(int copy:arr) {
			if(p1.and(p2).test(copy)) {
				System.out.println(copy);
			}
		}
		
		System.out.println();
		
		for(int copy:arr) {
			if(p1.or(p2).test(copy)) {
				System.out.println(copy);
			}
		}
		
		System.out.println();
		for(int copy:arr) {
			if(p1.and(p2).test(copy)) {
				System.out.println(copy);
			}
		}
	}

}
