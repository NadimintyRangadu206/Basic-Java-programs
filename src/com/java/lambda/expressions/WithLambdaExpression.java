package com.java.lambda.expressions;

@FunctionalInterface
interface ArthamaticOPerations{
	
	public int add(int a,int b);
	
	
}

//class Addition implements ArthamaticOPerations{
//
//	
//
//	@Override
//	public int add(int a, int b) {
//	System.out.println("Adding the two numbers:"+" "+ (a+b));	
//	return (2324);
//	}
//	
//}

public class WithLambdaExpression {

	public static void main(String[] args) {
		
//		Addition a= new Addition();
//		System.out.println(a.add(10,10));
		
		
		ArthamaticOPerations operation= ( a,b)->{System.out.println("Adding the two numbers:"+" "+ (a+b));
		return (424254);};
		System.out.println(operation.add(5, 6));
		
		
	}

}
