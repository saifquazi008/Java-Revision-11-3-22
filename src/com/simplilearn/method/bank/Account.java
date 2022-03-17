package com.simplilearn.method.bank;

public class Account {

	public long accNo;
	public String userName;
	public String email;
	public double balance;

	// non parameterized constructor
	public Account() {
	}

//  parameterized constructor : initialize all data variable of class
	public Account(long accNo, String userName, String email, double balance) {
		this.accNo = accNo;
		this.userName = userName;
		this.email = email;
		this.balance = balance;
	}

}
