package com.java8.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMapConcept2 {

	public static void main(String[] args) {

		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> multipleNo = new ArrayList<>();
		int copy;
		for (Integer no : numberList) {
			for (int j = 1; j <= 5; j++) {
				multipleNo.add(no * j);

			}

		}
		System.out.println(multipleNo);
		
		
//		Using The Stream
		int j=3;
		numberList.stream().map(no->no*j).forEach(System.out::println);

	}

}
