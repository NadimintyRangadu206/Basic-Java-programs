package com.javatpoint.collections.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleTwoArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(70);
		list1.add(80);
		list1.add(30);
		list1.add(40);
		list1.add(120);
		list1.add(330);
		list1.add(70);
		System.out.println("print the arrayList elements:" + "\n" + list1 + "\n");
		System.out.println(list1.size() + "\n");
		List<Integer> list2 = new ArrayList<>();

		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(80);
		list2.add(500);
		list2.add(600);
		list2.add(700);
		System.out.println(list2 + "\n");
		System.out.println(list2.size() + "\n");

		System.out.println("Converting ArrayList to Array");
		System.out.println("Converting ArrayList to Array  with Parameters");

		Integer[] arr1 = new Integer[list1.size()];
		list1.toArray(arr1);
		System.out.println(Arrays.toString(arr1) + "\n");

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		Integer[] arr2 = new Integer[list2.size()];
		list2.toArray(arr2);
		System.out.println(Arrays.toString(arr2) + "\n");
		for (int j = 0; j < arr2.length; j++) {
			System.out.print(arr2[j] + " ");
		}
		System.out.println();

		int arr3 = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (i == j) {
					arr3 = arr1[i] * arr2[j];
					System.out.println(arr3);
				}
			}

		}
		
		
		ArrayList<Object> obj= new ArrayList<>();
		obj.add("sdskd");
		obj.add(10.00);
		obj.add(20);
		obj.add('r');
		System.out.println(obj);
	}

}
