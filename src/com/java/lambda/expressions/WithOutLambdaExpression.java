package com.java.lambda.expressions;

@FunctionalInterface
interface Mobile {
	public void brand();
}


class Vivo implements Mobile {

	@Override
	public void brand() {
		System.out.println("Vivo is one type of brand in mobile");
	}

}

public class WithOutLambdaExpression {

	public static void main(String[] args) {
		Vivo v = new Vivo();
		v.brand();
	}

}
