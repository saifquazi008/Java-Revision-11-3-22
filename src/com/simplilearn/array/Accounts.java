package com.simplilearn.array;

public class Accounts {

	private long id;
	private long accNo;
	private String name;
	private double balance;
	private String email;
	private String branch;

	public Accounts() {
		super();
	}

	public Accounts(long id, long accNo, String name, double balance, String email, String branch) {
		super();
		this.id = id;
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.email = email;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Accounts [id=" + id + ", accNo=" + accNo + ", name=" + name + ", balance=" + balance + ", email="
				+ email + ", branch=" + branch + "]";
	}

}
