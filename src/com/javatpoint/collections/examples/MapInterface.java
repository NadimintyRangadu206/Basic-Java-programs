package com.javatpoint.collections.examples;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {

		// create Map interface
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(5, "English");
		map.put(2, "Telugu");
		map.put(3, "Tamil");
		map.put(9, "Kannada");
		map.put(1, "Marati");
		map.put(8, "Hindi");
		map.put(7, "Malayalam");
		map.put(6, "Punjabi");
		map.put(4, "Bengali");

		System.out.println(map);
		System.out.println(map.toString() + "\n");// different way to print

		System.out.println("Using For loop");

		for (int i = 1; i < map.size(); i++) {
			System.out.println(map.get(i));
		}

		System.out.println();
		System.out.println("Using While condition");

		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry=it.next();
			System.out.println("Key"+"="+" "+entry.getKey().toString()+" "+":"+"Value"+"="+entry.getValue());
		}
		
		
		System.out.println();
		System.out.println("Using for each loop");
		for (Map.Entry<Integer, String> copy : map.entrySet()) {
			System.out.println("key"+"="+ copy.getKey()+":"+" "+"Value"+"="+copy.getValue());
		}
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		map.entrySet().stream().sorted(Map.Entry.comparingByValue());
	}

}
