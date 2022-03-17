package com.simplilearn.array;

import java.util.Arrays;

public class AccountsArray {

	public static void main(String[] args) {

		// create Accounts Array

		Accounts[] accounts = new Accounts[5];

		// insert data into accounts array

		accounts[0] = new Accounts(1, 12344345, "Saif Quazi", 2324554, "saif@gmail.com", "pulgaon");
		accounts[1] = new Accounts(2, 13452345, "Arbaz Sheikh", 4524554, "Arbaz@gmail.com", "MP");
		accounts[2] = new Accounts(3, 134567876, "Shahid khan", 654433, "Shahid@gmail.com", "Bihar");
		accounts[3] = new Accounts(4, 234568765, "Baba Bhai", 223466, "baba@gmail.com", "UP");
		accounts[4] = new Accounts(5, 98765432, "Furkan Bhai", 765434, "Furkan@gmail.com", "Nagpur");

		System.out.println(Arrays.toString(accounts));
		System.out.println("---------------------------------------");

		System.out.println(accounts[1]);
		System.out.println("---------------------------------------");

		System.out.println(accounts[3]);
		System.out.println("---------------------------------------");

		for (int index = 0; index < accounts.length; index++) {
			System.out.println("Element at index : " + index + " value : " + accounts[index]);
			System.out.println("---------------------------------------");

		}

	}

}
