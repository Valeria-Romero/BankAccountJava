package com.newbank.accounts;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount julieAccount = new BankAccount();
		julieAccount.deposit(100.49, "checking");
		julieAccount.deposit(3.00, "savings");
		julieAccount.displayBalance();

		System.out.println("Total amount of money: " + BankAccount.totalAmountMoney);

		julieAccount.withdraw(50, "checking");
		julieAccount.withdraw(50, "savings");
		julieAccount.displayBalance();

		System.out.println("Total amount of money: " + BankAccount.totalAmountMoney);
	}
}
