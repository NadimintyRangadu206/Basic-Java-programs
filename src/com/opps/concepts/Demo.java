package com.opps.concepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	private String name;
	private int age;

	public void accept() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Name:");
		name = br.readLine();
		System.out.println("Enter a age:");
		age = Integer.parseInt(br.readLine());
	}

	public void check() {
		if (age <= 25) {
			System.out.println("young age:" + " " + age + "\n" + name);
		} else if (age <= 50) {
			System.out.println("middle age:" + " " + age + "\n" + name);
		} else {
			System.out.println("Old age:" + " " + age + "\n" + name);
		}
	}

	public static void main(String[] args) throws IOException {

		Demo d = new Demo();
		d.accept();
		d.check();
	}

}
