package com.opps.inheritance;


class BackendDeveloper{
	
	public void implementsCode() {
		System.out.println("BackendDeveloper implenets the code");
	}
}
class FeDeveloper extends BackendDeveloper{
	public void designUserInterface() {
		System.out.println("Design user interface");
	}
}

class TestingTeam extends FeDeveloper{
	
	
	public void testing() {
		System.out.println("Implementation code is testing!");
	
	}
	
	public void implementsCode() {
		super.implementsCode();
		System.out.println("Testing");
	
	
	}
}


public class User {

	public static void main(String[] args) {
	
		TestingTeam t= new TestingTeam();
		t.testing();
		t.designUserInterface();
		t.implementsCode();
	

	}

}
