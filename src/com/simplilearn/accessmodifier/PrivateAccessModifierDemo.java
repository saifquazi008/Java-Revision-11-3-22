package com.simplilearn.accessmodifier;

public class PrivateAccessModifierDemo {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();

		// account.balance; // compile time error.
		// account.fdAmount; // compile time error.
		// account.showBalance(); // compile time error.
		account.printAll();

	}

}

class BankAccount {

	// private variable : properties : data members

	private double balance = 5659.77;
	private double fdAmount = 5445.76;

	// private methods : member function
	private double showBalance() {
		return balance;
	}

	private double showfdAmount() {
		return fdAmount;

	}

	// public methods
	public void printAll() {
		System.out.println("The balance : " + balance + " & fd amount  : " + fdAmount);
	}

}