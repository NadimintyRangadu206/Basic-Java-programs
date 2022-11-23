package com.application;

public class BankAccount {

	 String acctHolderName;
	 long accountNumber;
	 double balance;
	 int mobileNo;
	 String state;
	 String bankName;
	 
	public BankAccount(String aHn,long aN, double b,int mN,String s,String bN){
		acctHolderName=aHn;
		accountNumber=aN;
		balance=b;
		mobileNo=mN;
		state=bN;
	 }
	
	public double checkBalance() {	
		return balance;
	}
	
	public double deposit(double b) {
		double totalBalnce=balance+b;
		return totalBalnce;
	}
	
	public double withdraw(double b) {
		
	double d=balance-b;
		return d;
	}
	
	public static void main(String[] args) {
		BankAccount bank=new BankAccount("Raju",32428478,1000.00,49234892,"Andra Pradesh","Indusind");
		System.out.println(bank.checkBalance());
		
		System.out.println(bank.deposit(2000.00));
		System.out.println(bank.withdraw(500.00));
		
	}
}
