package com.basic.methods;

class Methods {
	private int num1;// instance variables
	private int num2;

	Methods(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void add() {

		int num3 = num1 + num2;
		System.out.println("Sum of the two numbers:" + " " + num3);
	}

	public double multi(int m1, int m2) {

		double d = m1 * m1;
		return d;
	}

}

public class InstanceMethods {

	int number;
	String text;

	InstanceMethods(int number, String text) {

		this.number = number;
		this.text = text;
	}

	public void Display() {

		System.out.println("Display the Instance variable:" + " " + number + " " + text);
	}

	public static void main(String[] args) {
		InstanceMethods s = new InstanceMethods(1222, "skdj");
		s.Display();

		Methods m = new Methods(15, 10);
		m.add();
		double rs = m.multi(5, 6);
		System.out.println("Display the multiplication result:" + rs);

	}
}
