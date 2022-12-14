package com.filehandliing.concept;

import java.util.Scanner;

/**
 * 
 * @author nadim
 *
 */
public class Assignment4 {

	public static void main(String[] args) {

		Assignment4 vbf = new Assignment4();
		int choice = 1;
		switch (choice) {
		case 1:

			System.out.print(Assignment4.sub());
			break;

		default:
			break;
		}

	}

	public static boolean sub() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a week day");
		String day = sc.next();
		if (day == "Monday" || day == "Tuesday" || day == "Wednesday" || day == "Thrusday" || day == "friday") {
			System.out.printf("%s", "uff", "it's week day");
		} else {
			System.out.printf("%s %s %s", "yayy", ",", "it's weekend");
		}
		return true;
	}

}
