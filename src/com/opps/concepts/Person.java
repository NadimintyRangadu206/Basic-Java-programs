package com.opps.concepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Person {

	int id;
	String name;

	public Person() {
		id = 16;
		name = "nhsdhws";
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void walking() {

		System.out.println("He is walking  20 km " + " :" + id + " " + name);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		Person raju = new Person(29, "oewjkriejwi");
		raju.walking();
		int code = raju.hashCode();
		System.out.println("Display the hash code " + ":" + code);

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Age:");
//		int age = sc.nextInt();
//		if (age <= 28) {
//			System.out.println("young person");
//		} else if (age <= 45) {
//			System.out.println("middle age person");
//		} else {
//			System.out.println("old age person");
//		}

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a user name:");
		String userName=br.readLine();
		System.out.println("Enter a age:");
		int age =Integer.parseInt(br.readLine());		
		if (age <= 28) {
			System.out.println("young person:"+" "+ age+"\n"+userName);
		} else if (age <= 45) {
			System.out.println("middle age person:"+" "+ age+"\n"+userName);
		} else {
			System.out.println("old age person"+" "+ age+"\n"+userName);
		}
	}

}
