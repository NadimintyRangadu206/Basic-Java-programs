package com.basic.methods;

public class Sample {

	int number;
	String text;
	Sample(int number, String text){
		
		this.number=number;
		this.text=text;
	}
	public void Display() {

		System.out.println("Display the Instance variable:" + " " + number + " " + text);
	}

	public static void main(String[] args) {
		Sample s = new Sample(1222,"skdj");
		s.Display();
	}
}
