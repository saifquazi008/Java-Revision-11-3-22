package com.simplilearn.method.bank;

public class Test {

	public static void main(String[] args) {

		// create a ccount object
		Account account = new Account(11223344, "Saif Quazi", "saif@gmail.com", 10000);

		// create a BankOperation object
		BankOperations operation = new BankOperations();
		System.out.println("Wellcome to the Bank ::" + operation.bankName);

		System.out.println("------------------------");
		System.out.println("The user balance : " + operation.showbalance(account));
		System.out.println("------------------------");

		System.out.println("The user balance after deposit: " + operation.depositeAmt(account, 1000.56));
		System.out.println("The user balance after deposit: " + operation.depositeAmt(account, 5000.00));

		System.out.println("The user balance after withdraw: " + operation.withdrawAmt(account, 1000.56));
		System.out.println("The user balance after withdraw: " + operation.withdrawAmt(account, 5000.00));
	}

}
