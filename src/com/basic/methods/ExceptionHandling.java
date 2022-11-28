package com.basic.methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Execution is start!");
		int fNo = 10;
		int sNo = 0;

		
		FileInputStream file = new FileInputStream("E:text.doc");

		int result = 0;
		try {
			result = fNo / sNo;
		} catch (Exception e) {
			System.out.println(e.toString());
			// Stack Trace
//			Exception name: "Arthamatic Exception" some thing like this.
//			Exception message: /by zero.
//			which line
//			method name:
		}
		System.out.println(result);
		System.out.println("Execution is end!");
	}


}
