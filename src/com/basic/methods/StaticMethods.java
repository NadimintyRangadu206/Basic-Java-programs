package com.basic.methods;

class Test {

	static int i;
	Test(int i) {
		Test.i = i;
	}

	public static void show() {
             try {
				System.out.println("Display the Show method!"+i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
//Test(int i) {
//this.i = i;
//} // this works only for instance variable not static variables.

public class StaticMethods {

	public static void main(String[] args) {
       
	Test t= new Test(5);
		Test.show();
		//t.show();
	}
}
