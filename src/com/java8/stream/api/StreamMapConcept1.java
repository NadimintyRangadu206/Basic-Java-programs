package com.java8.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapConcept1 {

	public static void main(String[] args) {

		List<String> namesList = Arrays.asList("Java", "Python", "JavaScript", "Oracle", "Selenium", "SpringBOot",
				"Angular");

		
		// With out Using a Streams.
		List<String> upperConv = new ArrayList<>();

//		for (String copy : namesList) {
//
//			upperConv.add(copy.toUpperCase());
//		}
//		System.out.println(upperConv);

		
		// With Using Streams Concept.
		upperConv=namesList.stream().map(copy->copy.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(upperConv);
		
		namesList.stream().map(copy->copy.toUpperCase()).forEach(copy->System.out.print(copy+" "));// another way to print
		
		System.out.println();
		namesList.stream().map(copy->copy.toUpperCase()).forEach(System.out::print);
		
		
		
		// Find the Length Of Each Element in a List.
 
		// With Out Using Stream Concept
		System.out.println();
		List<Integer> wordlength = new ArrayList<>();

		for (String i : namesList) {
			wordlength.add(i.length());
		}
		System.out.println(wordlength);
		
		
	// With Using Stream Concept.
		
		namesList.stream().map(i->i.length()).forEach(i->System.out.print(i+" "));
		
		
	
	}
}
