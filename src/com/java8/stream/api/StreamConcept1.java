package com.java8.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamConcept1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		list.add(40);
		list.add(45);
		list.add(50);
		
		
		// with out using Stream api
		
		List<Integer> list1 = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45, 50);// another way to create a arrayList

		List<Integer> evenNoList = new ArrayList<>();

//		for (int no : list1) {// print even numbers
//			if (no % 2 == 0) {
//				evenNoList.add(no);
//			}
//		}
//
//		System.out.println(evenNoList);
		
		System.out.println();
		
		// with using Stream api.
		
//		evenNoList=list1.stream().filter(n->n%2==0).collect(Collectors.toList());
//		System.out.println(evenNoList);
		
		
//		list1.stream().filter(n->n%2!=0).forEach(n->System.out.println(n));
		
		list1.stream().filter(n->n%2!=0).forEach(System.out::println); // another way of approach. removing lambda expressions.
		
	
	}

}
