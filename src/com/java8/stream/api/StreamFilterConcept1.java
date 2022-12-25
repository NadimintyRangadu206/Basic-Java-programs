package com.java8.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterConcept1 {

	public static void main(String[] args) {

		List<String> languageLists = Arrays.asList("Java", "Python", "JavaScript", "Oracle", "Selenium", "SpringBOot",
				"Angular");

		List<String> longestCharactersString = new ArrayList<>();

		longestCharactersString = languageLists.stream().filter(str -> str.length() > 5 && str.length() < 10)
				.collect(Collectors.toList());

		System.out.println(longestCharactersString);

		System.out.println();

		System.out.println("Using forEach");
		System.out.println();

		languageLists.stream().filter(str->str.length()>5 && str.length()<10).forEach(str->System.out.println(str));
		
		System.out.println();
		System.out.println("Using ::"+"\n");
		
		
		languageLists.stream().filter(str->str.length()>5 && str.length()<10).forEach(System.out::println);
	}

}
