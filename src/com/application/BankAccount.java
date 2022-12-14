package com.application;

public class BankAccount {

	double amount = 10000.00;

	public void welCome() {

		System.out.println("Wel come to my Bank");
	}

	public void checkBalance() {

		System.out.println("Current Balance !" + amount);
	}

	public void deposit(double deposit) {
		double totalAmount = deposit + amount;
		amount = totalAmount;
		System.out.println("Total Amount in our bank:" + amount);

	}

	public void withdraw(double withdraw) {
		double required = amount - withdraw;
		System.out.println("After withdraw than required amount in bank:" + required);
	}

	public static void main(String[] args) {

		BankAccount ba = new BankAccount();
		ba.welCome();
		ba.checkBalance();
		ba.deposit(10000.00);
		ba.withdraw(5000.00);

	}
}
