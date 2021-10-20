package com.newbank.accounts;

public class BankAccount {
	public static int numAccounts = 0;
	public static double totalAmountMoney =0;
	
//	Attributes
	private double checkingBalance;
	private double savingsBalance;
	
	public BankAccount() {
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		numAccounts++;
	}
	
//	Getters
	public double getCheckingBalance() {
		System.out.println(this.checkingBalance);
		return this.checkingBalance;
	}
	
	public double getSavingBalance() {
		System.out.println(this.savingsBalance);
		return this.savingsBalance;
	}
	
	public void displayBalance() {
		System.out.println("You savings account: " + this.savingsBalance);
		System.out.println("You checking account: " + this.checkingBalance);
	}
	
//	Setters
	public void deposit(double amount, String account) {
		if(account.equals("savings"))
			this.savingsBalance += amount;
		else if(account.equals("checking"))
			this.checkingBalance += amount;
		BankAccount.totalAmountMoney += amount;
	}
	
	
	public void withdraw(double amount, String account) {
		boolean available = false;
		if(account.equals("savings")) {
			// check amount
			if(this.savingsBalance - amount >= 0) {
				available = true;
				this.savingsBalance -= amount;
			}
		}
		else if(account.equals("checking")) {
			// check amount
			if(this.checkingBalance - amount >= 0) {
				available = true;
				this.checkingBalance -= amount;
			}
		}
		if(available) {
			BankAccount.totalAmountMoney -= amount;
		}
	}
	
	
}
