package com.simplilearn.method.bank;

public class BankOperations {

	public String bankName = "Quazi Bank";

	// show balance
	public double showbalance(Account account) {
		if (account != null) {
			return account.balance;
		}
		return 0;
	}

	// deposit amount

	public double depositeAmt(Account acc, double amount) {
		if (amount > 0) {
			acc.balance += amount; // account.balance = account.balance + amount;
			return acc.balance;

		} else {
			System.out.println("Invalid Deposite Amount !");
			return 0;
		}
	}

	// withdraw amount
	public double withdrawAmt(Account acc, double amount) {
		if (amount > 0) {
			acc.balance -= amount; // account.balance = account.balance - amount;
			return acc.balance;

		} else {
			System.out.println("Invalid Withdraw Amount !");
			return 0;
		}
	}

}
